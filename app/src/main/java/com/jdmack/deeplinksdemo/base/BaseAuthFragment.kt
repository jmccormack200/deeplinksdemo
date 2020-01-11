package com.jdmack.deeplinksdemo.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.jdmack.deeplinksdemo.login.LoginRepository
import com.jdmack.deeplinksdemo.R

abstract class BaseAuthFragment: BaseFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        if (!LoginRepository.isLoggedIn()) {
            findNavController().navigate(R.id.login_fragment)
        }
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}