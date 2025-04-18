/*
 * Copyright © 2014-2024 The Android Password Store Authors. All Rights Reserved.
 * SPDX-License-Identifier: GPL-3.0-only
 */

package app.passwordstore.ui.settings

import de.Maxr1998.modernpreferences.PreferenceScreen

/** Used to generate a uniform API for all settings UI classes. */
interface SettingsProvider {

  /** Inserts the settings items for the class into the given [builder]. */
  fun provideSettings(builder: PreferenceScreen.Builder)
}
