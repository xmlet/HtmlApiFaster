package org.xmlet.htmlapifaster;

import org.xmlet.xsdasmfaster.classes.infrastructure.EnumInterface;

public enum EnumDisplayType implements EnumInterface<String> {
   BLOCK(String.valueOf("block")),
   INLINE(String.valueOf("inline"));

   private final String value;

   private EnumDisplayType(String var3) {
      this.value = var3;
   }

   public final String getValue() {
      return this.value;
   }
}
