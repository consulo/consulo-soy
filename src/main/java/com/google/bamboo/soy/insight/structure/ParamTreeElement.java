package com.google.bamboo.soy.insight.structure;

import jakarta.annotation.Nullable;

import com.google.bamboo.soy.elements.ParamElement;
import consulo.util.lang.StringUtil;

/**
 * @author VISTALL
 * @since 2018-09-12
 */
public class ParamTreeElement extends BaseTreeElement<ParamElement>
{
	public ParamTreeElement(ParamElement psiElement)
	{
		super(psiElement);
	}

	@Nullable
	@Override
	public String getPresentableText()
	{
		return getPresentableName(getElement()) + " " + getElement().getParamName();
	}

	@Override
	public String getLocationString()
	{
		String inlinedValue = getElement().getInlinedValue();
		return StringUtil.notNullize(inlinedValue);
	}
}
