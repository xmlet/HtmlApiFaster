package org.xmlet.htmlapifaster;

import org.xmlet.xsdasmfaster.classes.infrastructure.EnumInterface;

public enum EnumAutocompleteType implements EnumInterface<String> {
   YES(String.valueOf("yes")),
   NO(String.valueOf("no"));

   private final String value;

   private EnumAutocompleteType(String var3) {
      this.value = var3;
   }

   public final String getValue() {
      return this.value;
   }
}
