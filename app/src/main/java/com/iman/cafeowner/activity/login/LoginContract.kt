package com.iman.cafeowner.activity.login

interface LoginContract {

    interface View {
        fun emptyUsername()
        fun emptyPassword()
    }

    interface Presenter {
        fun login(username: String?, password: String?)
    }
}