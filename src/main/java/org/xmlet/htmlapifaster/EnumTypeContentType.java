package org.xmlet.htmlapifaster;

import org.xmlet.xsdasmfaster.classes.infrastructure.EnumInterface;

public enum EnumTypeContentType implements EnumInterface<String> {
   TEXT_ASP(String.valueOf("text/asp")),
   TEXT_ASA(String.valueOf("text/asa")),
   TEXT_CSS(String.valueOf("text/css")),
   TEXT_HTML(String.valueOf("text/html")),
   TEXT_JAVASCRIPT(String.valueOf("text/javascript")),
   TEXT_PLAIN(String.valueOf("text/plain")),
   TEXT_SCRIPTLET(String.valueOf("text/scriptlet")),
   TEXT_X_COMPONENT(String.valueOf("text/x-component")),
   TEXT_X_HTML_INSERTION(String.valueOf("text/x-html-insertion")),
   TEXT_XML(String.valueOf("text/xml"));

   private final String value;

   private EnumTypeContentType(String var3) {
      this.value = var3;
   }

   public final String getValue() {
      return this.value;
   }
}
