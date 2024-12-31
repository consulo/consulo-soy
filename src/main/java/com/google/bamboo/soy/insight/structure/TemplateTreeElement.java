package com.google.bamboo.soy.insight.structure;

import jakarta.annotation.Nullable;

import com.google.bamboo.soy.parser.SoyTemplateBlock;

/**
 * @author VISTALL
 * @since 2018-09-12
 */
public class TemplateTreeElement extends BaseTreeElement<SoyTemplateBlock>
{
	public TemplateTreeElement(SoyTemplateBlock psiElement)
	{
		super(psiElement);
	}

	@Nullable
	@Override
	public String getPresentableText()
	{
		return getPresentableName(getElement()) + " " + getElement().getName();
	}
}
