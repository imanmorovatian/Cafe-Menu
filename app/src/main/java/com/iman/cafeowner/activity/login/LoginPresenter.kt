package com.iman.cafeowner.activity.login

class LoginPresenter(private val mView: LoginContract.View): LoginContract.Presenter {
    override fun login(username: String?, password: String?) {

        if (username.isNullOrEmpty())
            mView.emptyUsername()

        if (password.isNullOrEmpty())
            mView.emptyPassword()
    }

}