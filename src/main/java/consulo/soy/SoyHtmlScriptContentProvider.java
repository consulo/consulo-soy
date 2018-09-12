package consulo.soy;

import javax.annotation.Nullable;

import com.intellij.lang.HtmlScriptContentProvider;
import com.intellij.lexer.Lexer;
import com.intellij.psi.tree.IElementType;

/**
 * @author VISTALL
 * @since 2018-09-12
 *
 * FIXME [VISTALL] We need this?
 */
public class SoyHtmlScriptContentProvider implements HtmlScriptContentProvider
{
	@Override
	public IElementType getScriptElementType()
	{
		return null;
	}

	@Nullable
	@Override
	public Lexer getHighlightingLexer()
	{
		return null;
	}
}
