package com.google.bamboo.soy.insight.structure;

import javax.annotation.Nullable;

import com.google.bamboo.soy.parser.SoyLetSingleStatement;

/**
 * @author VISTALL
 * @since 2018-09-12
 */
public class LetSingleTreeElement extends BaseTreeElement<SoyLetSingleStatement>
{
	public LetSingleTreeElement(SoyLetSingleStatement psiElement)
	{
		super(psiElement);
	}

	@Nullable
	@Override
	public String getPresentableText()
	{
		return getPresentableName(getElement()) + " " + getElement().getVariableDefinitionIdentifier().getName();
	}

	@Override
	public String getLocationString()
	{
		return getElement().getExpr().getText();
	}
}
