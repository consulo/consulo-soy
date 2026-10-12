package com.google.bamboo.soy.insight.structure;

import consulo.annotation.access.RequiredReadAction;
import consulo.localize.LocalizeValue;

import com.google.bamboo.soy.elements.ParamElement;
import consulo.util.lang.StringUtil;

/**
 * @author VISTALL
 * @since 2018-09-12
 */
public class ParamTreeElement extends BaseTreeElement<ParamElement> {
    public ParamTreeElement(ParamElement psiElement) {
        super(psiElement);
    }

    @Override
    @RequiredReadAction
    public LocalizeValue getPresentableText() {
        return LocalizeValue.join(
            getPresentableName(getElement()),
            LocalizeValue.space(),
            LocalizeValue.ofNullable(getElement().getParamName())
        );
    }

    @Override
    @RequiredReadAction
    public String getLocationString() {
        String inlinedValue = getElement().getInlinedValue();
        return StringUtil.notNullize(inlinedValue);
    }
}
