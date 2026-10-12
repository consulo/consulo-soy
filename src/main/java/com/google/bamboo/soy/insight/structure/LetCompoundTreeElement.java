package com.google.bamboo.soy.insight.structure;

import consulo.annotation.access.RequiredReadAction;
import consulo.localize.LocalizeValue;

import com.google.bamboo.soy.parser.SoyLetCompoundStatement;

/**
 * @author VISTALL
 * @since 2018-09-12
 */
public class LetCompoundTreeElement extends BaseTreeElement<SoyLetCompoundStatement> {
    public LetCompoundTreeElement(SoyLetCompoundStatement psiElement) {
        super(psiElement);
    }

    @Override
    @RequiredReadAction
    public LocalizeValue getPresentableText() {
        return LocalizeValue.join(
            getPresentableName(getElement()),
            LocalizeValue.space(),
            LocalizeValue.of(getElement().getBeginLet().getVariableDefinitionIdentifier().getName())
        );
    }
}
