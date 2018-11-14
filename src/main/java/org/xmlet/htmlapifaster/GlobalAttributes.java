package org.xmlet.htmlapifaster;

public interface GlobalAttributes<T extends Element<T, Z>, Z extends Element> extends GlobalEventAttributes<T, Z> {
   default T attrAccesskey(String attrAccesskey) {
      this.getVisitor().visitAttributeAccesskey(attrAccesskey);
      return this.self();
   }

   default T attrClass(String attrClass) {
      this.getVisitor().visitAttributeClass(attrClass);
      return this.self();
   }

   default T attrContenteditable(EnumContenteditableType attrContenteditable) {
      this.getVisitor().visitAttributeContenteditable(attrContenteditable.getValue());
      return this.self();
   }

   default T attrDir(EnumDirType attrDir) {
      this.getVisitor().visitAttributeDir(attrDir.getValue());
      return this.self();
   }

   default T attrDraggable(EnumDraggableType attrDraggable) {
      this.getVisitor().visitAttributeDraggable(attrDraggable.getValue());
      return this.self();
   }

   default T attrHidden(Boolean attrHidden) {
      this.getVisitor().visitAttributeHidden(attrHidden.toString());
      return this.self();
   }

   default T attrId(String attrId) {
      this.getVisitor().visitAttributeId(attrId);
      return this.self();
   }

   default T attrLang(String attrLang) {
      this.getVisitor().visitAttributeLang(attrLang);
      return this.self();
   }

   default T attrSpellcheck(EnumSpellcheckType attrSpellcheck) {
      this.getVisitor().visitAttributeSpellcheck(attrSpellcheck.getValue());
      return this.self();
   }

   default T attrStyle(String attrStyle) {
      this.getVisitor().visitAttributeStyle(attrStyle);
      return this.self();
   }

   default T attrTabIndex(Integer attrTabIndex) {
      this.getVisitor().visitAttributeTabIndex(attrTabIndex.toString());
      return this.self();
   }

   default T attrTitle(String attrTitle) {
      this.getVisitor().visitAttributeTitle(attrTitle);
      return this.self();
   }

   default T attrTranslate(EnumTranslateType attrTranslate) {
      this.getVisitor().visitAttributeTranslate(attrTranslate.getValue());
      return this.self();
   }
}
