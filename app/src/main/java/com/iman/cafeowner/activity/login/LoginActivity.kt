package com.iman.cafeowner.activity.login


import android.content.Intent
import android.os.Bundle
import com.iman.cafeowner.R
import com.iman.cafeowner.activity.mainactivity.MainActivity
import com.iman.cafeowner.utils.BaseActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : BaseActivity(), LoginContract.View {

    private val mPresenter = LoginPresenter(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        setupLoginButton()
    }

    private fun setupLoginButton() {
        login_button.setOnClickListener {
            //this is temporary
            startActivity(Intent(this, MainActivity::class.java))
            //
            val username = edit_text_username.text.toString().trim()
            val password = edit_text_password.text.toString().trim()
            mPresenter.login(username, password)
        }
    }

    override fun emptyUsername() {}

    override fun emptyPassword() {}

}
