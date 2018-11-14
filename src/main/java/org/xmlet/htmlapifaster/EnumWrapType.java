package org.xmlet.htmlapifaster;

import org.xmlet.xsdasmfaster.classes.infrastructure.EnumInterface;

public enum EnumWrapType implements EnumInterface<String> {
   HARD(String.valueOf("hard")),
   SOFT(String.valueOf("soft"));

   private final String value;

   private EnumWrapType(String var3) {
      this.value = var3;
   }

   public final String getValue() {
      return this.value;
   }
}
