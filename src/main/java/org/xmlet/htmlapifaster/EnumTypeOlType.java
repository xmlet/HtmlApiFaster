package org.xmlet.htmlapifaster;

import org.xmlet.xsdasmfaster.classes.infrastructure.EnumInterface;

public enum EnumTypeOlType implements EnumInterface<String> {
   _1(String.valueOf("1")),
   a(String.valueOf("a")),
   A(String.valueOf("A")),
   i(String.valueOf("i")),
   I(String.valueOf("I"));

   private final String value;

   private EnumTypeOlType(String var3) {
      this.value = var3;
   }

   public final String getValue() {
      return this.value;
   }
}
