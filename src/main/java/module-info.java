/**
 * @author VISTALL
 * @since 29/01/2023
 */
module consulo.soy {
  requires consulo.code.editor.api;
  requires consulo.color.scheme.api;
  requires consulo.component.api;
  requires consulo.configurable.api;
  requires consulo.datacontext.api;
  requires consulo.document.api;
  requires consulo.file.editor.api;
  requires consulo.index.io;
  requires consulo.language.api;
  requires consulo.language.code.style.api;
  requires consulo.language.code.style.ui.api;
  requires consulo.language.editor.api;
  requires consulo.language.impl;
  requires consulo.localize.api;
  requires consulo.logging.api;
  requires consulo.project.api;
  requires consulo.ui.api;
  requires consulo.util.collection;
  requires consulo.util.io;
  requires consulo.util.lang;
  requires consulo.virtual.file.system.api;

  requires com.intellij.xml.api;
  requires com.intellij.xml.html.api;
  requires com.intellij.xml;
  requires com.google.common;

  // FileStub validation consulo.language.psi.stub.IStubFileElementType.hasNonTrivialExternalId()
  opens com.google.bamboo.soy.stubs to consulo.util.lang;
}
