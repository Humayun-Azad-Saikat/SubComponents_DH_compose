package com.example.subcomponents_dh_compose.modules

import androidx.compose.ui.text.rememberTextMeasurer
import com.example.subcomponents_dh_compose.AnalyticsService
import com.example.subcomponents_dh_compose.Mixpanel
import dagger.Module
import dagger.Provides
import dagger.hilt.migration.DisableInstallInCheck
import javax.inject.Singleton

@DisableInstallInCheck
@Module
class AnalyticsModule {

    @Singleton
    @Provides
    fun getAnalyticsService(): AnalyticsService {
        return Mixpanel()
    }

}