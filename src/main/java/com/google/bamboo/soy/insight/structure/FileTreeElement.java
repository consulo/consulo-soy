package com.google.bamboo.soy.insight.structure;

import jakarta.annotation.Nullable;

import com.google.bamboo.soy.file.SoyFile;

/**
 * @author VISTALL
 * @since 2018-09-12
 */
public class FileTreeElement extends BaseTreeElement<SoyFile>
{
	public FileTreeElement(SoyFile psiElement)
	{
		super(psiElement);
	}

	@Nullable
	@Override
	public String getPresentableText()
	{
		return getElement().getName();
	}
}
