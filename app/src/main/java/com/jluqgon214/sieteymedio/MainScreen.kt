package com.jluqgon214.sieteymedio

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.jluqgon214.sieteymedio.SieteyMedio.data.Baraja

@Composable
fun MainScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Button(onClick = {
            navController.navigate("CartaMasAlta")
            Log.e("Test", "${Baraja.listaCartas}")
        }) {
            Text(text = "TODO")
        }

        Button(onClick = {navController.navigate("SieteyMedio")}) {
            Text(text = "Siete y Medio")
        }
    }
}