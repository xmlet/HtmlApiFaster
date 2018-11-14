package org.xmlet.htmlapifaster;

import org.xmlet.xsdasmfaster.classes.infrastructure.EnumInterface;

public enum EnumTypeSimpleContentType implements EnumInterface<String> {
   TEXT_ASP(String.valueOf("text/asp")),
   TEXT_ASA(String.valueOf("text/asa")),
   TEXT_HTML(String.valueOf("text/html")),
   TEXT_PLAIN(String.valueOf("text/plain")),
   TEXT_XML(String.valueOf("text/xml"));

   private final String value;

   private EnumTypeSimpleContentType(String var3) {
      this.value = var3;
   }

   public final String getValue() {
      return this.value;
   }
}
