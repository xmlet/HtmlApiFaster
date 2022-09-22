package org.xmlet.htmlapifaster;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.reactivestreams.Publisher;
import org.xmlet.htmlapifaster.async.SupplierMemoize;
import org.xmlet.htmlapifaster.async.Thenable;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

import static java.lang.Math.toIntExact;
import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doNothing;


@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@ExtendWith(MockitoExtension.class)
class ElementTest {
    
    @Mock
    private ElementVisitor visitor;
    
    @DisplayName("When calling async")
    @Nested
    class AsyncMethodTest {
        
        @Test
        void given_parameters_when_async_then_visitor_receives_correct_reference() {
            
            ArgumentCaptor<Supplier> supplierArgumentCaptor = ArgumentCaptor.forClass(Supplier.class);
            final Publisher<String> stringPublisher = Flux.fromIterable(asList("1", "2", "3"));
            
            BiConsumer<Table<Body<Html<Element>>>, Publisher<String>> cons =
                    (elem, pub) -> Flux
                        .from(pub)
                        .doOnNext(s -> elem.thead().tr().text(s))
                        .subscribe(); // Subscribe to this Flux and request UNBOUNDED demand.
            
            final Table<Body<Html<Element>>> table = new Html<>(visitor)
                    .body()
                    .table();
            
            doNothing().when(visitor).visitAsync(supplierArgumentCaptor.capture(), eq(cons), eq(stringPublisher));
            
            table.async(stringPublisher, cons);
            
            assertEquals(table, supplierArgumentCaptor.getValue().get());
        }
        
        @Test
        void given_parameters_when_async_then_thenable_passes_correct_reference_when_calling_async() {
            
            ArgumentCaptor<SupplierMemoize> supplierArgumentCaptor = ArgumentCaptor.forClass(SupplierMemoize.class);
            final Publisher<String> stringPublisher = Flux.fromIterable(asList("1", "2", "3"));
            final Publisher<Integer> integerPublisher = Flux.range(1, 3);
            
            BiConsumer<Table<Body<Html<Element>>>, Publisher<String>> cons =
                    (elem, pub) -> Flux
                        .from(pub)
                        .subscribe(s -> elem.thead().tr().text(s)); // Subscribe to this Flux and request UNBOUNDED demand.
            
            BiConsumer<Table<Body<Html<Element>>>, Publisher<Integer>> consBody =
                    (elem, pub) -> Flux
                        .from(pub)
                        .subscribe(elem::text); // Subscribe to this Flux and request UNBOUNDED demand.

            final Thenable<Table<Body<Html<Element>>>> thenable = new Html<>(visitor)
                    .body()
                    .table()
                    .async(stringPublisher, cons);
            
            doNothing().when(visitor).visitAsync(supplierArgumentCaptor.capture(), eq(consBody), eq(integerPublisher));
            
            thenable.async(integerPublisher, consBody);
            
            assertTrue(supplierArgumentCaptor.getValue().get().getClass().isAssignableFrom(Table.class));
        }
        
        @Test
        void given_parameters_when_calling_then_thenable_passes_correct_reference_when_calling_async() {
            
            ArgumentCaptor<SupplierMemoize> supplierArgumentCaptor = ArgumentCaptor.forClass(SupplierMemoize.class);
            final Publisher<String> stringPublisher = Flux.fromIterable(asList("1", "2", "3"));
            
            BiConsumer<Table<Body<Html<Element>>>, Publisher<String>> cons =
                    (elem, pub) -> Flux
                        .from(pub)
                        .doOnNext(s -> elem.thead().tr().text(s))
                        .subscribe(); // Subscribe to this Flux and request UNBOUNDED demand.
            
            Function<Table<Body<Html<Element>>>,Html<Element>> bodyCont = elem -> elem.__().__();
    
            final Thenable<Table<Body<Html<Element>>>> thenable = new Html<>(visitor)
                    .body()
                    .table()
                    .async(stringPublisher, cons);
    
            doNothing().when(visitor).visitThen(supplierArgumentCaptor.capture());
            
            thenable.then(bodyCont);
            
            assertTrue(supplierArgumentCaptor.getValue().get().getClass().isAssignableFrom(Html.class));
        }
    }
    
    @Test
    void test_async_view() {
        Publisher<String> titles = Flux
                .fromIterable(asList("Nr", "Name"));

        Publisher<Student> studentPublisher = Flux
                .interval(Duration.of(10, ChronoUnit.MILLIS))
                .map(n -> n + 1)
                .map(nr -> new Student(nr, randomNameGenerator(toIntExact(nr))))
                .take(5);

        final Thenable<Element> thenable = new Html<>(visitor)
                .body()
                .div()
                .p()
                .text("Students from a school board")
                .__()
                .__()
                .div()
                .table()
                .thead()
                .tr()
                .async(titles,
                        (tr, titlesObs) -> Flux
                        .from(titlesObs)
                        .subscribe(nr -> tr.th().text(nr).__())) // Subscribe to this Flux and request UNBOUNDED demand.
                .then(tr -> tr.__().__().tbody())
                .async(studentPublisher, (tbody, studentObs) -> Flux
                        .from(studentObs)
                        .doOnNext(student -> tbody.tr()
                                .th()
                                    .text(student.nr)
                                .__()
                                    .td()
                                        .text(student.name)
                                    .__()
                                .__()))
                .then(tbody -> tbody.__().__().__().__().__());
        
        assertNotNull(thenable);
    }
    
    private String randomNameGenerator(int nr) {
        String[] names = new String[] {"Pedro", "Manuel", "Maria", "Clara","Rafael"};
        return names[nr-1];
    }
    
    private static class Student {
        private final long nr;
        private final String name;
    
        private Student(long nr, String name) {
            this.nr = nr;
            this.name = name;
        }
    
        @Override
        public String toString() {
            return String.format("Student nr " + nr + " with name " + name);
        }
    }
}
