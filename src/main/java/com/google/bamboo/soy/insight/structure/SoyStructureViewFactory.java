package com.google.bamboo.soy.insight.structure;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.google.bamboo.soy.file.SoyFile;
import com.google.bamboo.soy.file.SoyFileType;
import com.intellij.ide.structureView.StructureView;
import com.intellij.ide.structureView.StructureViewBuilder;
import com.intellij.ide.structureView.StructureViewModel;
import com.intellij.ide.structureView.TreeBasedStructureViewBuilder;
import com.intellij.ide.structureView.impl.StructureViewComposite;
import com.intellij.ide.structureView.impl.TemplateLanguageStructureViewBuilder;
import com.intellij.lang.PsiStructureViewFactory;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.fileEditor.FileEditor;
import com.intellij.psi.PsiFile;

/**
 * from kotlin
 */
public class SoyStructureViewFactory implements PsiStructureViewFactory
{
	@Nullable
	@Override
	public StructureViewBuilder getStructureViewBuilder(PsiFile psiFile)
	{
		return new TemplateLanguageStructureViewBuilder(psiFile)
		{
			@Override
			protected StructureViewComposite.StructureViewDescriptor createMainView(FileEditor fileEditor, PsiFile psiFile)
			{
				TreeBasedStructureViewBuilder builder = new TreeBasedStructureViewBuilder()
				{
					@Nonnull
					@Override
					public StructureViewModel createStructureViewModel(@Nullable Editor editor)
					{
						return new SoyStructureViewModel((SoyFile)psiFile, editor);
					}
				};

				StructureView structureView = builder.createStructureView(fileEditor, psiFile.getProject());

				return new StructureViewComposite.StructureViewDescriptor(SoyFileType.INSTANCE.getId(), structureView, null);
			}
		};
	}
}
