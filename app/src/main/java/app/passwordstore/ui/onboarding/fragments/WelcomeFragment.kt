/*
 * Copyright © 2014-2024 The Android Password Store Authors. All Rights Reserved.
 * SPDX-License-Identifier: GPL-3.0-only
 */

package app.passwordstore.ui.onboarding.fragments

import android.os.Bundle
import android.view.View
import androidx.annotation.Keep
import androidx.fragment.app.Fragment
import app.passwordstore.R
import app.passwordstore.databinding.FragmentWelcomeBinding
import app.passwordstore.ui.settings.SettingsActivity
import app.passwordstore.util.extensions.launchActivity
import app.passwordstore.util.extensions.performTransactionWithBackStack
import app.passwordstore.util.extensions.viewBinding

@Keep
class WelcomeFragment : Fragment(R.layout.fragment_welcome) {

  private val binding by viewBinding(FragmentWelcomeBinding::bind)

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    binding.letsGo.setOnClickListener {
      parentFragmentManager.performTransactionWithBackStack(CloneFragment.newInstance())
    }
    binding.settingsButton.setOnClickListener {
      requireActivity().launchActivity(SettingsActivity::class.java)
    }
  }
}
