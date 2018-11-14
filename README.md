[![Maven Central](https://img.shields.io/maven-central/v/com.github.xmlet/htmlApiFaster.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22com.github.xmlet%22%20AND%20a:%22htmlApiFaster%22)
[![Build](https://sonarcloud.io/api/project_badges/measure?project=com.github.xmlet%3AhtmlApiFasterTest&metric=alert_status)](https://sonarcloud.io/dashboard?id=com.github.xmlet%3AhtmlApiFasterTest)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=com.github.xmlet%3AhtmlApiFasterTest&metric=coverage)](https://sonarcloud.io/component_measures/domain/Coverage?id=com.github.xmlet%3AhtmlApiFasterTest)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=com.github.xmlet%3AhtmlApiFasterTest&metric=vulnerabilities)](https://sonarcloud.io/dashboard?id=com.github.xmlet%3AhtmlApiFasterTest)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=com.github.xmlet%3AhtmlApiFasterTest&metric=bugs)](https://sonarcloud.io/dashboard?id=com.github.xmlet%3AhtmlApiFasterTest)

# HtmlApiFaster

<div align="justify"> 
    HtmlApiFaster is a fluent Java DSL for the HTML5.2 language. It follows the XML schema 
    definition, i.e. XSD, for the HTML5.2 language, which means that all the syntax rules are enforced, either being attribute 
    value restrictions or regarding element organization. This DSL can be used in multiple ways, since all the classes present 
    in this DSL implement the Visitor pattern, so it is possible to define your own Visitor implementation to manipulate the HTML language 
    for any purpose, for example, to writing well formed HTML to a text file, a stream, a database, etc.   
    <br />
    <br />
    All the code present in this library was automatically generated based a XSD file representing the rules of HTML5.2. 
    In order to generate this code some additional libraries were needed such as <a href="https://github.com/xmlet/XsdAsmFaster">XsdAsmFaster</a>, 
    <a href="https://github.com/xmlet/XsdParser">XsdParser</a> and <a href="http://asm.ow2.org/">ASM</a>. 
    More information of how this library was generated will be added further.
</div>

## Installation

<div align="justify"> 
    First, in order to include it to your Maven project, simply add this dependency:
    <br />
    <br />
</div>

```xml
<dependency>
    <groupId>com.github.xmlet</groupId>
    <artifactId>htmlApiFaster</artifactId>
    <version>1.0.6</version>
</dependency>
``` 

## Usage

<div align="justify"> 
    Below it is presented a Java example that shows how the DSL works. It has the following HTML as base.
    <br />
    <br />
</div>

```xml
<html>
    <head>
        <meta charset="UTF-8"/>
        <title>
            Title
        </title>
        <link type="text/css" href="/assets/images/favicon.png" />
        <link type="text/css" href="assets/styles/main.css" />
    </head>
    <body class="clear">
        <div id="col-wrap">
            <header id="header">
                <section class="contain clear">
                    <div class="logo">
                        <img id="brand" src="./assets/images/logo.png" />
                    </div>
                    <aside>
                        <em>
                            Advertisement: <span class="number">HtmlApi is great!</span>
                        </em>
                    </aside>
                </section>
            </header>
        </div>
    </body>
</html>
```

```java
public class HtmlApiExample {
    public void simpleAPIUsage(){
        CustomVisitor customVisitor = new CustomVisitor();

        new Html<Html>(customVisitor)
            .head()
                .comment("This is a comment.")
                .meta().attrCharset("UTF-8").__()
                .title()
                    .text("Title").__()
                .link().attrType(EnumTypeContentType.TEXT_CSS).attrHref("/assets/images/favicon.png").__()
                .link().attrType(EnumTypeContentType.TEXT_CSS).attrHref("/assets/styles/main.css").__().__()
            .body().attrClass("clear")
                .div()
                    .header()
                        .section()
                            .div()
                                .img().attrId("brand").attrSrc("./assets/images/logo.png").__()
                                .aside()
                                    .em()
                                        .text("Advertisement")
                                        .span()
                                            .text("HtmlApi is great!")
                                        .__()
                                    .__()
                                .__()
                            .__()
                        .__()
                    .__()
                .__()
            .__()
        .__();

        String result = customVisitor.getResult();
    }
}
```

<div align="justify"> 
    The DSL that the HtmlApiFaster provides is pretty straightforward. After creating an <i>Html</i> element we can keep on
    creating the HTML element tree by invoking methods of the <i>Html</i> class. Each class that represents an HTML element,
    such as <i>Html</i>, <i>Div</i>, <i>P</i>, etc. has its respective methods, acording to the HTML5.2 language specification.
    The naming convention of the methods has two variants:
    <br />
    <br />
    <ul>
         <li>
             When adding another element - The method has the name of the element being added, i.e. calling the <i>head()</i> method 
             on the <i>root</i> variable will add a <i>head</i> instance to the <i>html</i> children list.
         </li>
         <li>
             When adding another attribute - The method name has the prefix <i>attr</i> before the attribute name.
         </li>
    </ul>
    A few notes regarding the usage of the DSL:
    <br />
    <br />
    <ul>
        <li>
            The methods which add elements to the element tree return the newly created element.
        </li>
        <li>
            The methods which add attributes to the element attributes return the element where the attribute was added.
        </li>
        <li>
            To navigate to the parent element we have the <i>__()</i> method.
        </li>
    </ul>
</div>

### The Visitor Pattern

<div align="justify">
    Having the Java code presented in the previous example how can we generate the respective HTML document? We need to implement
    the <i>ElementVisitor</i> abstract class. This class has four different abstract methods:
    <br />
    <br />
    <ul>
        <li>
            <i>visitElement(Element element)</i> - This method is called whenever a class generated based on a XSD <i>xsd:element</i> has its
            <i>accept</i> method called. By receiving the <i>Element</i> we have access to the element children and attributes.
        </li>
        <li>
            <i>visitAttribute(String attributeName, String attributeValue)</i> - This method is called when an attribute method is called. It received the 
            attribute name and the attribute value.
        </li>
        <li>
            <i>visitParent(Element element)</i> - This method is called when the <i>__()</i> method is invoked, receiving the instance
            where the method was invoked.
        </li>
        <li>
            <i>visitText(Text<? extends Element, R> text)</i> - This method is called when the <i>text</i> method is invoked.
        </li>
        <li>
            <i>visitComment(Text<? extends Element, R> comment)</i> - This method is called when the <i>comment</i> method is invoked.
        </li>
    </ul>
    Apart from this five methods we have other specific methods for each element class created, e.g. the <i>Html</i> class, as 
    we can see below with the methods <i>visitParentHtml</i> and <i>visitElementHtml</i>. The same strategy is applied to attributes
    using the <i>manifest</i> attribute as an example with the method <i>visitAttributeManifest</i>. This way a concrete 
    Visitor implementation can redefine these methods to create a specific behaviour to solve a certain proble.
</div>

```java
public class ElementVisitor {
    public abstract void visitElement(Element element);
    
    public abstract void visitAttribute(String attributeName, String attributeValue);
    
    public abstract void visitParent(Element element);
    
    public abstract <R> void visitText(Text<? extends Element, R> text);
    
    public abstract <R> void visitComment(Text<? extends Element, R> comment);
    
    public void visitOpenDynamic() { }
    
    public void visitCloseDynamic() { }
    
    public void visitParentHtml(Html element) {
        this.visitParent(element);
    }
    
    public void visitElementHtml(Html element) {
        this.visitElement(element);
    }
    
    public void visitAttributeManifest(String manifest) {
        this.visitAttribute("manifest", manifest);
    }
}
```

### Element binding

<div align="justify">  
    The HtmlApiFaster provides the definition of HTML templates as functions. For example, in the next snippet we define
    a template that returns a table presenting information received as parameter.
    <br />
    <br />
</div>

```java
public class BinderExample{
    public String bindExample(List<String> names){
        CustomVisitor visitor = new CustomVisitor();
        
        new Html<>(visitor)
            .body()
                .table()
                    .tr()
                        .th()
                            .text("Title")
                        .__()
                    .__()
                    .of(table ->
                        names.forEach(name ->
                            table
                                .tr()
                                    .td()
                                        .text(name)
                                    .__()
                                .__()
                        )
                    )
                .__()
            .__()
        .__();

        return visitor.getResult();
    }
 }
```

## Code Quality

<div align="justify"> 
    Even though the code present in this DSL is generated code we implemented some tests to assert code quality, 
    vulnerabilities and other various metrics. The results are available in the <i>xmlet</i> 
    <a href="https://sonarcloud.io/dashboard?id=com.github.xmlet%3AhtmlApiFasterTest">Sonarcloud</a> page.
</div>
  
## Final remarks

<div align="justify">  
    Even though this DSL is created based on aumatically generated classes there are a few nuances. In order to provide 
    DSL users with source files and java documentation of the DSL, the automatically generated classes are decompiled, 
    using <a href="https://mvnrepository.com/artifact/org.jboss.windup.decompiler/decompiler-fernflower/4.0.0.Final">Fernflower Decompiler used by Intellij</a>, 
    and then compiled regularly by the maven lifecycle. This process, apart from allowing the DSL users to have the 
    source and documention files also allows to verify that there are no compiler problems with the code, which is very 
    helpful when making changes in the way that this DSL is generated.
</div>
