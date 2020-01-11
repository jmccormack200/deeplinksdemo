package com.jdmack.deeplinksdemo.dashboard

class DashboardPresenter (private val screen: DashboardScreen) {
    fun screenOneClicked() {
        screen.navigateToScreenOne()
    }

    fun screenTwoClicked() {
        screen.navigateToScreenTwo()
    }

    fun screenThreeClicked() {
        screen.navigateToScreenThree()
    }

}

interface DashboardScreen {
    fun navigateToScreenOne()
    fun navigateToScreenTwo()
    fun navigateToScreenThree()
}