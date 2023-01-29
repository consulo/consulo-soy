/**
 * @author VISTALL
 * @since 29/01/2023
 */
module consulo.soy {
  requires consulo.ide.api;
  requires com.intellij.xml;
  requires com.google.common;

  // FileStub validation consulo.language.psi.stub.IStubFileElementType.hasNonTrivialExternalId()
  opens com.google.bamboo.soy.stubs to consulo.util.lang;
}