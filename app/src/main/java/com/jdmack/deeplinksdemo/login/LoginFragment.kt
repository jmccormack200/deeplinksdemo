package com.jdmack.deeplinksdemo.login

import android.os.Bundle
import android.view.View
import android.view.View.VISIBLE
import androidx.navigation.fragment.findNavController
import com.jdmack.deeplinksdemo.R
import com.jdmack.deeplinksdemo.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : BaseFragment(), LoginScreen {

    override val layout = R.layout.fragment_login

    override fun login() {
        findNavController().navigate(R.id.action_login_to_dashboard)
    }

    override fun showError() {
        loginError.visibility = VISIBLE
    }

    private val presenter = LoginPresenter(this)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loginButton.setOnClickListener { presenter.loginButtonClicked(username.text.toString(), password.text.toString()) }
    }

}
