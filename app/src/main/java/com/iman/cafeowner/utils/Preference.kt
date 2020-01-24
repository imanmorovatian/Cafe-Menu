package com.iman.cafeowner.utils

import android.content.Context

class Preference(context: Context) {
    private companion object {
        const val NAME = "information"
        const val LOGIN_PROVIDER = "is_login"
        const val TOKEN = "token"
    }

    private val mPreference = context.getSharedPreferences(NAME, Context.MODE_PRIVATE)

    fun setLoginProvider(isLogin: Boolean) = mPreference.edit().putBoolean(LOGIN_PROVIDER, isLogin).apply()
    //fun setToken(token: String) = mPreference.edit().putString( TOKEN, "Bearer $token").apply()

    fun isLoggedIn(): Boolean = mPreference.getBoolean(LOGIN_PROVIDER, false)
    //fun getToken(): String? = mPreference.getString(TOKEN, null)

    fun clear() = mPreference.edit().clear().apply()
}