/*
 * Copyright 2000-2009 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.intellij.extapi.psi;

import com.intellij.psi.impl.source.LightPsiFileImpl;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.FileViewProvider;
import com.intellij.lang.Language;
import com.intellij.lang.LanguageDialect;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

public abstract class LightPsiFileBase extends LightPsiFileImpl {
  public LightPsiFileBase(final FileViewProvider provider, final Language language) {
    super(provider, language);
  }

  @Override
  public boolean isDirectory() {
    return false;
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    visitor.visitFile(this);
  }

}
