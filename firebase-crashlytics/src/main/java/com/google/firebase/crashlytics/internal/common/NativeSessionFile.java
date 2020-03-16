// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.InputStream;

/**
 * An abstraction of a "File" resource sent to the Crashlytics backend when an NDK Crash has
 * occurred.
 */
interface NativeSessionFile {
  /** Shortname of the file, e.g., "logs" */
  @NonNull
  String getName();

  /** Representation of the NativeSessionFile as a stream */
  @Nullable
  InputStream getStream();

  /**
   * Representation of the NativeSessionFile as {@link CrashlyticsReport.FilesPayload.File} object.
   */
  @Nullable
  CrashlyticsReport.FilesPayload.File asFilePayload();
}