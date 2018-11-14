package org.xmlet.htmlapifaster;

import org.xmlet.xsdasmfaster.classes.infrastructure.EnumInterface;

public enum EnumRelType implements EnumInterface<String> {
   ALTERNATE(String.valueOf("alternate")),
   AUTHOR(String.valueOf("author")),
   HELP(String.valueOf("help")),
   ICON(String.valueOf("icon")),
   LICENSE(String.valueOf("license")),
   NEXT(String.valueOf("next")),
   PREV(String.valueOf("prev")),
   SEARCH(String.valueOf("search")),
   STYLESHEET(String.valueOf("stylesheet"));

   private final String value;

   private EnumRelType(String var3) {
      this.value = var3;
   }

   public final String getValue() {
      return this.value;
   }
}
