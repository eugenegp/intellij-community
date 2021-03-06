/*
 * Copyright 2000-2011 JetBrains s.r.o.
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
package com.intellij.cvsSupport2.cvsoperations.cvsMessages;

import org.netbeans.lib.cvsclient.file.ICvsFileSystem;

/**
 * author: lesya
 */
public class CvsMessagesAdapter implements CvsMessagesListener{
  public void addMessage(MessageEvent event) {
  }

  public void commandFinished(String commandName, long time) {
  }

  public void addFileMessage(FileMessage message) {
  }

  public void commandStarted(String command) {
  }

  public void addError(String message, String relativeFilePath, ICvsFileSystem cvsFileSystem, String cvsRoot, boolean warning) {
  }

  public void addFileMessage(String message, ICvsFileSystem cvsFileSystem) {
  }

  public void addMessage(String message) {
  }
}
