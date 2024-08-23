package com.example.subcomponents_dh_compose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.subcomponents_dh_compose.ui.theme.SubComponents_DH_composeTheme
import javax.inject.Inject


class MainActivity : ComponentActivity() {

    @Inject
    lateinit var userResistaionService: UserResistaionService


   lateinit var emailService: EmailService
   lateinit var emailService1: EmailService


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SubComponents_DH_composeTheme {
               Surface(
                   modifier = Modifier.fillMaxSize(),
                   color = Color.White
               ) {

                   val appComponent = (application as UserApplication).appComponent
                   val component = appComponent.getUserConsumerComponentFactory().create(3)

                   //val component = appComponent.getUserConsumerComponent() if we didn't had any factory


                   emailService = component.getEmailservice()
                   emailService1 = component.getEmailservice()

                  Log.d("emailServiceclasscode", "${emailService}")
                  Log.d("emailServiceclasscode1", "${emailService1}")
                  component.injectMainAC(this)
                  userResistaionService.resisterUser("","")





               }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

}