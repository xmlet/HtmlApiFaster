package org.xmlet.htmlapifaster;

import org.xmlet.xsdasmfaster.classes.infrastructure.EnumInterface;

public enum EnumShapeType implements EnumInterface<String> {
   RECT(String.valueOf("rect")),
   CIRCLE(String.valueOf("circle")),
   POLY(String.valueOf("poly")),
   DEFAULT(String.valueOf("default"));

   private final String value;

   private EnumShapeType(String var3) {
      this.value = var3;
   }

   public final String getValue() {
      return this.value;
   }
}
