package com.google.bamboo.soy.insight.structure;

import consulo.annotation.access.RequiredReadAction;
import consulo.localize.LocalizeValue;

import com.google.bamboo.soy.parser.SoyLetSingleStatement;

/**
 * @author VISTALL
 * @since 2018-09-12
 */
public class LetSingleTreeElement extends BaseTreeElement<SoyLetSingleStatement> {
    public LetSingleTreeElement(SoyLetSingleStatement psiElement) {
        super(psiElement);
    }

    @Override
    @RequiredReadAction
    public LocalizeValue getPresentableText() {
        return LocalizeValue.join(
            getPresentableName(getElement()),
            LocalizeValue.space(),
            LocalizeValue.of(getElement().getVariableDefinitionIdentifier().getName())
        );
    }

    @Override
    @RequiredReadAction
    public String getLocationString() {
        return getElement().getExpr().getText();
    }
}
