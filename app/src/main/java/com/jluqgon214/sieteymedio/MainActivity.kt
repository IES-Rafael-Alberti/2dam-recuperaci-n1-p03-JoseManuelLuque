package com.jluqgon214.sieteymedio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jluqgon214.sieteymedio.SieteyMedio.SieteyMedio
import com.jluqgon214.sieteymedio.SieteyMedio.data.SyMViewModel
import com.jluqgon214.sieteymedio.ui.theme.SieteYMedioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val SyMViewModel: SyMViewModel by viewModels()
        super.onCreate(savedInstanceState)
        setContent {
            SieteYMedioTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = "MainScreen"
                    ) {
                        composable("MainScreen") {
                            MainScreen(navController)
                        }
                        composable("CartaMasAlta") {
                            //TODO
                        }
                        composable("SieteYMedio") {
                            SieteyMedio(SyMViewModel)
                        }
                    }
                }
            }
        }
    }
}