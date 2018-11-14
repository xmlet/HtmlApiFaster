package org.xmlet.htmlapifaster;

import org.xmlet.xsdasmfaster.classes.infrastructure.EnumInterface;

public enum EnumTranslateType implements EnumInterface<String> {
   EMPTY(String.valueOf("")),
   YES(String.valueOf("yes")),
   NO(String.valueOf("no"));

   private final String value;

   private EnumTranslateType(String var3) {
      this.value = var3;
   }

   public final String getValue() {
      return this.value;
   }
}
