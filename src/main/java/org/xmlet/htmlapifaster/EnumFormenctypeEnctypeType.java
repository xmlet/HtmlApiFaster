package org.xmlet.htmlapifaster;

import org.xmlet.xsdasmfaster.classes.infrastructure.EnumInterface;

public enum EnumFormenctypeEnctypeType implements EnumInterface<String> {
   MULTIPART_FORM_DATA(String.valueOf("multipart/form-data")),
   APPLICATION_X_WWW_FORM_URLENCODED(String.valueOf("application/x-www-form-urlencoded")),
   TEXT_PLAIN(String.valueOf("text/plain"));

   private final String value;

   private EnumFormenctypeEnctypeType(String var3) {
      this.value = var3;
   }

   public final String getValue() {
      return this.value;
   }
}
