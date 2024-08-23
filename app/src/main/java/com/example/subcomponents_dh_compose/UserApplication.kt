package com.example.subcomponents_dh_compose

import android.app.Application


/**
 * we have to impliment this class in the androidmanifest file in <application level like this:
 * android:name=".UserApplication"
 */


class UserApplication:Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate(){
        super.onCreate()

        appComponent = DaggerAppComponent.builder().build()


    }

}