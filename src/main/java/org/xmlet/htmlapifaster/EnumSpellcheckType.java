package org.xmlet.htmlapifaster;

import org.xmlet.xsdasmfaster.classes.infrastructure.EnumInterface;

public enum EnumSpellcheckType implements EnumInterface<String> {
   EMPTY(String.valueOf("")),
   TRUE(String.valueOf("true")),
   FALSE(String.valueOf("false"));

   private final String value;

   private EnumSpellcheckType(String var3) {
      this.value = var3;
   }

   public final String getValue() {
      return this.value;
   }
}
