package com.jluqgon214.sieteymedio.SieteyMedio.data.data

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.jluqgon214.sieteymedio.CartaMasAlta.data.CartaAltaViewModel
import com.jluqgon214.sieteymedio.SieteyMedio.data.SyMViewModel

@Composable
fun SieteYMedio(SyMViewModel: SyMViewModel, navController: NavHostController) {
    Text(text = "Siete y Medio")
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MostrarCarta(viewModel: SyMViewModel, navController: NavController, imagenId: Int) {
    Card(
        onClick = {
            viewModel.getCard()
            viewModel.ComprobarGanador()
        },
        modifier = Modifier
            .width(150.dp)
            .height(228.dp)
    ) {
        Image(
            painter = painterResource(id = imagenId),
            contentDescription = "Carta",
            modifier = Modifier.fillMaxSize()
        )
    }
}
