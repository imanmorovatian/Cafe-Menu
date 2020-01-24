package com.iman.cafeowner.data.model
import java.io.Serializable

data class MainMenuItem(val mTitle: String, val mIcon: Int, val action: Runnable): Serializable