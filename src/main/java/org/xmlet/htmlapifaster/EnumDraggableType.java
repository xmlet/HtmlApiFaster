package org.xmlet.htmlapifaster;

import org.xmlet.xsdasmfaster.classes.infrastructure.EnumInterface;

public enum EnumDraggableType implements EnumInterface<String> {
   TRUE(String.valueOf("true")),
   FALSE(String.valueOf("false")),
   AUTO(String.valueOf("auto"));

   private final String value;

   private EnumDraggableType(String var3) {
      this.value = var3;
   }

   public final String getValue() {
      return this.value;
   }
}
