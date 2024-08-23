package com.example.subcomponents_dh_compose

import com.example.subcomponents_dh_compose.MainActivity
import com.example.subcomponents_dh_compose.modules.NotificaionServiceModule
import com.example.subcomponents_dh_compose.modules.UserRepositoryModule
import com.example.subcomponents_dh_compose.qualifiers.ActivityScope
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent


//this is subcomponent

@ActivityScope
@Subcomponent(modules = [UserRepositoryModule::class, NotificaionServiceModule::class])
interface ConsumerComponent {

    fun injectMainAC(mainActivity: MainActivity)

    fun getEmailservice(): EmailService


    @Subcomponent.Factory
    interface Factory{
        fun create(@BindsInstance retryCount:Int):ConsumerComponent
    }

}