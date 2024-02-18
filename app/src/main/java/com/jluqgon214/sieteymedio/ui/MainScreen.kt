package com.jluqgon214.sieteymedio.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.jluqgon214.sieteymedio.R

@Composable
fun MainScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.carta_alta),
            contentDescription = "Carta mas Alta",
            modifier = Modifier
                .clickable { navController.navigate("CartaMasAlta") }
                .weight(400.toFloat())
                .fillMaxWidth()
        )

        Image(
            painter = painterResource(id = R.drawable.siete_medio),
            contentDescription = "Siete y Medio",
            modifier = Modifier
                .clickable { navController.navigate("SieteYMedio") }
                .weight(400.toFloat())
                .fillMaxWidth()
        )
    }

}