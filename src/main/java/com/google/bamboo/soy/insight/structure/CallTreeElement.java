package com.google.bamboo.soy.insight.structure;

import consulo.annotation.access.RequiredReadAction;
import consulo.localize.LocalizeValue;

import com.google.bamboo.soy.elements.CallStatementElement;

/**
 * @author VISTALL
 * @since 2018-09-12
 */
public class CallTreeElement extends BaseTreeElement<CallStatementElement> {
    protected CallTreeElement(CallStatementElement psiElement) {
        super(psiElement);
    }

    @Override
    @RequiredReadAction
    public LocalizeValue getPresentableText() {
        return LocalizeValue.join(
            getPresentableName(getElement()),
            LocalizeValue.space(),
            LocalizeValue.ofNullable(getElement().getTemplateName())
        );
    }
}
