package com.jluqgon214.sieteymedio

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun MainScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Button(onClick = {navController.navigate("CartaMasAlta")}) {

        }

        Button(onClick = {navController.navigate("SieteyMedio")}) {

        }
    }
}