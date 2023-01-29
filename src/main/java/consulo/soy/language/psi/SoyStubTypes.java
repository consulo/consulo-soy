package consulo.soy.language.psi;

import com.google.bamboo.soy.stubs.*;
import consulo.language.psi.stub.IStubElementType;
import consulo.language.psi.stub.IStubFileElementType;

/**
 * @author VISTALL
 * @since 29/01/2023
 */
public interface SoyStubTypes {
  IStubFileElementType<?> FILE = FileStub.TYPE;
  IStubElementType TEMPLATE_BLOCK = TemplateBlockStub.TYPE;
  IStubElementType TEMPLATE_DEFINITION_IDENTIFIER = TemplateDefinitionStub.TYPE;
  IStubElementType NAMESPACE_DECLARATION_IDENTIFIER = NamespaceDeclarationStub.TYPE;
  IStubElementType AT_PARAM_SINGLE = AtParamStub.TYPE;
}
