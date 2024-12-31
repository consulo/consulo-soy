package com.google.bamboo.soy.insight.structure;

import jakarta.annotation.Nullable;

import com.google.bamboo.soy.parser.SoyLetCompoundStatement;

/**
 * @author VISTALL
 * @since 2018-09-12
 */
public class LetCompoundTreeElement extends BaseTreeElement<SoyLetCompoundStatement>
{
	public LetCompoundTreeElement(SoyLetCompoundStatement psiElement)
	{
		super(psiElement);
	}

	@Nullable
	@Override
	public String getPresentableText()
	{
		return getPresentableName(getElement()) + " " + getElement().getBeginLet().getVariableDefinitionIdentifier().getName();
	}
}
