/*
 * Copyright 2000-2012 JetBrains s.r.o.
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
package git4idea;

import com.intellij.dvcs.DvcsPlatformFacadeImpl;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vcs.AbstractVcs;
import com.intellij.openapi.vcs.ProjectLevelVcsManager;
import git4idea.config.GitVcsSettings;
import git4idea.repo.GitRepositoryManager;
import org.jetbrains.annotations.NotNull;

/**
 * @author Kirill Likhodedov
 */
class GitPlatformFacadeImpl extends DvcsPlatformFacadeImpl implements GitPlatformFacade {

  @NotNull
  @Override
  public AbstractVcs getVcs(@NotNull Project project) {
    return ProjectLevelVcsManager.getInstance(project).findVcsByName(GitVcs.NAME);
  }

  @NotNull
  @Override
  public Notificator getNotificator(@NotNull Project project) {
    return Notificator.getInstance(project);
  }

  @NotNull
  @Override
  public GitRepositoryManager getRepositoryManager(@NotNull Project project) {
    return ServiceManager.getService(project, GitRepositoryManager.class);
  }

  @NotNull
  @Override
  public GitVcsSettings getSettings(@NotNull Project project) {
    return GitVcsSettings.getInstance(project);
  }
}
