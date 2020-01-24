package com.iman.cafeowner.activity.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import com.iman.cafeowner.R
import com.iman.cafeowner.activity.mainactivity.MainActivity
import com.iman.cafeowner.activity.login.LoginActivity
import com.iman.cafeowner.utils.App
import com.iman.cafeowner.utils.BaseActivity

class SplashActivity: BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
        supportActionBar?.hide()
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            when {
                App.getPreference().isLoggedIn() -> startActivity(Intent(this, MainActivity::class.java))
                else -> startActivity(Intent(this, LoginActivity::class.java))
            }
            finish()
        },1000)
    }
}