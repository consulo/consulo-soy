package com.google.bamboo.soy.insight.structure;

import consulo.annotation.access.RequiredReadAction;
import consulo.localize.LocalizeValue;

import com.google.bamboo.soy.file.SoyFile;

/**
 * @author VISTALL
 * @since 2018-09-12
 */
public class FileTreeElement extends BaseTreeElement<SoyFile> {
    public FileTreeElement(SoyFile psiElement) {
        super(psiElement);
    }

    @Override
    @RequiredReadAction
    public LocalizeValue getPresentableText() {
        return LocalizeValue.of(getElement().getName());
    }
}
