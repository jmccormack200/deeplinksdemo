package com.jdmack.deeplinksdemo.login

class LoginPresenter(private val screen: LoginScreen) {
    fun loginButtonClicked(username: String, password: String) {
        if (LoginRepository.login(username, password)) {
            screen.login()
        } else {
            screen.showError()
        }
    }
}

interface LoginScreen {
    fun login()
    fun showError()
}