package com.example.subcomponents_dh_compose

import com.example.subcomponents_dh_compose.modules.AnalyticsModule
import dagger.Component
import javax.inject.Singleton

//this is parent component

@Singleton
@Component(modules = [AnalyticsModule::class])
interface AppComponent {

    //fun getAnalyticsService():AnalyticsService

    fun getUserConsumerComponentFactory():ConsumerComponent.Factory//cause we have a factory in subcomponent
    //now this component can access subcomponent through factory

    //fun getUserConsumerComponent():ConsumerComponent
    //if we didn't had any factory

    //now consumerComponent(that is a subcomponent) can use every objects of this parent component(that is AppComponent)

}