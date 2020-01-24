package com.iman.cafeowner.activity.cafeprofile

import android.os.Bundle
import com.iman.cafeowner.R
import com.iman.cafeowner.utils.BaseActivity

class CafeProfileActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cafe_profile)
        supportActionBar?.hide()

    }
}
