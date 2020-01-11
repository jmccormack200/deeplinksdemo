package com.jdmack.deeplinksdemo.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.jdmack.deeplinksdemo.login.LoginRepository
import com.jdmack.deeplinksdemo.R

const val NAVIGATION_KEY = "NAV_KEY"

abstract class BaseAuthFragment: BaseFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        if (!LoginRepository.isLoggedIn()) {
            findNavController().navigate(R.id.login_fragment, bundleOf(
                NAVIGATION_KEY to findNavController().currentDestination?.id
            ))
        }
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}