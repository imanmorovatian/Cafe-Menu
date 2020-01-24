package com.iman.cafeowner.activity.login


import android.os.Bundle
import com.iman.cafeowner.R
import com.iman.cafeowner.utils.BaseActivity
class LoginActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()
    }

}
