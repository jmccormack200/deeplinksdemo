package com.jdmack.deeplinksdemo.dashboard

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.jdmack.deeplinksdemo.R
import com.jdmack.deeplinksdemo.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_dashboard.*

class DashboardFragment: BaseFragment(), DashboardScreen {
    override fun navigateToScreenOne() {
        findNavController().navigate(R.id.action_dashboard_to_screen1)
    }

    override fun navigateToScreenTwo() {
        findNavController().navigate(R.id.action_dashboard_to_screen2)
    }

    override fun navigateToScreenThree() {
        findNavController().navigate(R.id.action_dashboard_to_screen3)
    }

    private val presenter = DashboardPresenter(this)
    override val layout = R.layout.fragment_dashboard

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        screenOneButton.setOnClickListener { presenter.screenOneClicked() }
        screenTwoButton.setOnClickListener { presenter.screenTwoClicked() }
        screenThreeButton.setOnClickListener { presenter.screenThreeClicked() }
    }
}