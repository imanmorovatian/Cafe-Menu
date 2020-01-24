package com.iman.cafeowner.utils

import android.app.Application
import com.iman.cafeowner.R
import uk.co.chrisjenx.calligraphy.CalligraphyConfig

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        CalligraphyConfig.initDefault(
            CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/iransans-fa-number.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        )

    }

}