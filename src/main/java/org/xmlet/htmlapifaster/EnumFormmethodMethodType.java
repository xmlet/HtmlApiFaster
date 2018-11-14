package org.xmlet.htmlapifaster;

import org.xmlet.xsdasmfaster.classes.infrastructure.EnumInterface;

public enum EnumFormmethodMethodType implements EnumInterface<String> {
   GET(String.valueOf("get")),
   POST(String.valueOf("post")),
   DIALOG(String.valueOf("dialog"));

   private final String value;

   private EnumFormmethodMethodType(String var3) {
      this.value = var3;
   }

   public final String getValue() {
      return this.value;
   }
}
