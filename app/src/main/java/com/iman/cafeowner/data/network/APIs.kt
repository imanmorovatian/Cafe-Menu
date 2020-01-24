package com.iman.cafeowner.data.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class APIs private constructor() {

    companion object {
        private var mRetrofit: Retrofit? = null
        private const val BASE_URL = "http://142.0.68.236/"

        private fun client(): Retrofit {
            if (mRetrofit == null) {
                mRetrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return mRetrofit!!

        }

        fun services(): Services = client().create(Services::class.java)
    }

    interface Services {
//        @POST("token")
//        @FormUrlEncoded
//        fun login(
//            @Field("username") username: String,
//            @Field("password") password: String,
//            @Field("grant_type") grantType: String
//        ): Call<LoginResponse>
    }
}