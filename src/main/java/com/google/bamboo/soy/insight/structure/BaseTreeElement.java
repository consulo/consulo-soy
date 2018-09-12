package com.google.bamboo.soy.insight.structure;

import java.util.Collection;
import java.util.Collections;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.google.bamboo.soy.elements.TagBlockElement;
import com.google.bamboo.soy.parser.SoyNamespaceBlock;
import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.ide.structureView.impl.common.PsiTreeElementBase;
import com.intellij.psi.PsiElement;
import com.intellij.util.containers.ContainerUtil;

/**
 * @author VISTALL
 * @since 2018-08-22
 */
public class BaseTreeElement<T extends PsiElement> extends PsiTreeElementBase<T>
{
	protected BaseTreeElement(T psiElement)
	{
		super(psiElement);
	}

	@Nonnull
	@Override
	public Collection<StructureViewTreeElement> getChildrenBase()
	{
		return getChildren(getValue());
	}

	protected Collection<StructureViewTreeElement> getChildren(PsiElement psiElement)
	{
		return ContainerUtil.flatten(ContainerUtil.map(psiElement.getChildren(), child ->
		{
			if(getPresentableName(child) != null)
			{
				return Collections.singletonList(SoyStructureViewModel.getTreeElement(child));
			}
			else
			{
				return getChildren(child);
			}
		}));
	}

	protected String getPresentableName(PsiElement psiElement)
	{
		if(psiElement instanceof TagBlockElement)
		{
			return ((TagBlockElement) psiElement).getTagName();
		}
		else if(psiElement instanceof SoyNamespaceBlock)
		{
			return "namespace";
		}
		return null;
	}

	@Nullable
	@Override
	public String getPresentableText()
	{
		return getPresentableName(getElement());
	}

	private static final int MAX_TEXT_LENGTH = 50;

	protected String shortenTextIfLong(@Nonnull String text)
	{
		if(text.length() <= MAX_TEXT_LENGTH)
		{
			return text;
		}

		int index = MAX_TEXT_LENGTH;
		while(index > MAX_TEXT_LENGTH - 20)
		{
			if(!Character.isLetter(text.charAt(index)))
			{
				break;
			}
			index--;
		}

		return text.substring(0, Character.isLetter(index) ? MAX_TEXT_LENGTH : index) + "\u2026";
	}
}
