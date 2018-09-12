package com.google.bamboo.soy.insight.structure;

import javax.annotation.Nullable;

import com.google.bamboo.soy.elements.CallStatementElement;

/**
 * @author VISTALL
 * @since 2018-09-12
 */
public class CallTreeElement extends BaseTreeElement<CallStatementElement>
{
	protected CallTreeElement(CallStatementElement psiElement)
	{
		super(psiElement);
	}

	@Nullable
	@Override
	public String getPresentableText()
	{
		return getPresentableName(getElement()) + " " + getElement().getTemplateName();
	}
}
