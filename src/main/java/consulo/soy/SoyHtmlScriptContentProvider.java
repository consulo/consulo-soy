package consulo.soy;

import com.google.bamboo.soy.SoyLanguage;
import consulo.annotation.component.ExtensionImpl;
import consulo.language.Language;
import consulo.language.ast.IElementType;
import consulo.language.lexer.Lexer;
import consulo.xml.lang.HtmlScriptContentProvider;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * @author VISTALL
 * @since 2018-09-12
 * <p>
 * FIXME [VISTALL] We need this?
 */
@ExtensionImpl
public class SoyHtmlScriptContentProvider implements HtmlScriptContentProvider {
  @Override
  public IElementType getScriptElementType() {
    return null;
  }

  @Nullable
  @Override
  public Lexer getHighlightingLexer() {
    return null;
  }

  @Nonnull
  @Override
  public Language getLanguage() {
    return SoyLanguage.INSTANCE;
  }
}
