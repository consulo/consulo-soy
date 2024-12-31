package consulo.soy.language.psi;

import consulo.annotation.component.ExtensionImpl;
import consulo.language.psi.stub.ObjectStubSerializerProvider;
import consulo.language.psi.stub.StubElementTypeHolder;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import java.lang.reflect.Field;
import java.util.List;

/**
 * @author VISTALL
 * @since 29/01/2023
 */
@ExtensionImpl
public class SoyStubTypesHolder extends StubElementTypeHolder<SoyStubTypes> {

  @Nullable
  @Override
  public String getExternalIdPrefix() {
    return null;
  }

  @Nonnull
  @Override
  public List<ObjectStubSerializerProvider> loadSerializers() {
    return allFromStaticFields(SoyStubTypes.class, Field::get);
  }
}
