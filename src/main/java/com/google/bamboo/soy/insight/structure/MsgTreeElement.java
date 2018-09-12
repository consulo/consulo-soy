package com.google.bamboo.soy.insight.structure;

import com.google.bamboo.soy.parser.SoyMsgStatement;
import com.intellij.openapi.util.text.StringUtil;

/**
 * @author VISTALL
 * @since 2018-09-12
 */
public class MsgTreeElement extends BaseTreeElement<SoyMsgStatement>
{
	public MsgTreeElement(SoyMsgStatement psiElement)
	{
		super(psiElement);
	}

	@Override
	public String getLocationString()
	{
		return shortenTextIfLong(StringUtil.notNullize(getElement().getDescription()));
	}
}
