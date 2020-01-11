package com.jdmack.deeplinksdemo.login


object LoginRepository {
//    NOTE: THIS IS FOR SIMPLE DEMONSTRATION ONLY, DO NOT IMPLEMENT PASSWORD PROTECTION THIS WAY.
    private var isLoggedIn = false

    fun login(username: String, password: String): Boolean {
        isLoggedIn = username == "user" && password == "password"
        return isLoggedIn
    }

    fun isLoggedIn(): Boolean {
        return isLoggedIn
    }
}