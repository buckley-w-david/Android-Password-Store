/*
 * Copyright © 2014-2024 The Android Password Store Authors. All Rights Reserved.
 * SPDX-License-Identifier: GPL-3.0-only
 */

package app.passwordstore.injection.context

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class ContextModule {

  /**
   * We inject [Context.getFilesDir] to break the dependency on [Context], allowing tests to run on
   * the JVM. The principle here is identical to why [app.passwordstore.util.totp.TotpFinder]
   * exists.
   *
   * @param context [ApplicationContext]
   * @return the path of app-specific files directory.
   */
  @Provides
  @FilesDirPath
  fun providesFilesDirPath(@ApplicationContext context: Context): String {
    return context.filesDir.path
  }
}
