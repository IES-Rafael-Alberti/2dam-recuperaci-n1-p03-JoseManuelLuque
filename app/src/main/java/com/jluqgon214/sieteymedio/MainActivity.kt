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
import com.jluqgon214.cartamasaltarecuperacion.CartaMasAlta
import com.jluqgon214.sieteymedio.CartaMasAlta.ui.CartaAltaViewModel
import com.jluqgon214.sieteymedio.SieteyMedio.dataSyM.data.SieteYMedio
import com.jluqgon214.sieteymedio.SieteyMedio.ui.SyMViewModel
import com.jluqgon214.sieteymedio.SieteyMedio.ui.Banca
import com.jluqgon214.sieteymedio.SieteyMedio.ui.Jugador
import com.jluqgon214.sieteymedio.ui.MainScreen
import com.jluqgon214.sieteymedio.ui.theme.SieteYMedioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val SyMViewModel: SyMViewModel by viewModels()
        val CartaAltaViewModel: CartaAltaViewModel by viewModels()
        super.onCreate(savedInstanceState)
        setContent {
            SieteYMedioTheme {
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
                            CartaMasAlta(viewModel = CartaAltaViewModel, navController = navController)
                        }
                        composable("SieteYMedio") {
                            SieteYMedio(SyMViewModel, navController)
                        }

                        composable("Jugador") {
                            Jugador(SyMViewModel, navController)
                        }

                        composable("Banca") {
                            Banca(SyMViewModel, navController)
                        }
                    }
                }
            }
        }
    }
}