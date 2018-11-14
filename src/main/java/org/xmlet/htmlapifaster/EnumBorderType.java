package org.xmlet.htmlapifaster;

import org.xmlet.xsdasmfaster.classes.infrastructure.EnumInterface;

public enum EnumBorderType implements EnumInterface<String> {
   _0(String.valueOf("0")),
   _1(String.valueOf("1"));

   private final String value;

   private EnumBorderType(String var3) {
      this.value = var3;
   }

   public final String getValue() {
      return this.value;
   }
}
