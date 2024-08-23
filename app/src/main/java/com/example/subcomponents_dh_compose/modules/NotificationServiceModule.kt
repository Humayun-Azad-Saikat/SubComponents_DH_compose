package com.example.subcomponents_dh_compose.modules


import com.example.subcomponents_dh_compose.EmailService
import com.example.subcomponents_dh_compose.MessageService
import com.example.subcomponents_dh_compose.NotificationService
import com.example.subcomponents_dh_compose.qualifiers.EmailQualifier
import dagger.Module
import dagger.Provides
import dagger.hilt.migration.DisableInstallInCheck
import javax.inject.Named

@DisableInstallInCheck
@Module
//class NotificaionServiceModule(private val retryCount:Int) {
class NotificaionServiceModule() {


    @Named("message")
    @Provides
    //fun getMessageService(): NotificationService {
    fun getMessageService(retryCount:Int): NotificationService {
        return MessageService(retryCount)
    }

    @EmailQualifier //for solving typing mistake problem we created own qualifier insted of @Named annotation
    @Provides
    fun getEmail():NotificationService{
        return EmailService()
    }
}