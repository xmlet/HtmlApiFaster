package org.xmlet.htmlapifaster;

import org.xmlet.xsdasmfaster.classes.infrastructure.EnumInterface;

public enum EnumDirType implements EnumInterface<String> {
   LTR(String.valueOf("ltr")),
   RTL(String.valueOf("rtl")),
   AUTO(String.valueOf("auto"));

   private final String value;

   private EnumDirType(String var3) {
      this.value = var3;
   }

   public final String getValue() {
      return this.value;
   }
}
