package com.jluqgon214.sieteymedio.SieteyMedio.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.jluqgon214.sieteymedio.R

@Composable
fun Jugador(viewModel: SyMViewModel, navController: NavHostController) {
    Column {
        Text(text = "Turno del Jugador")


        MostrarCarta(viewModel = viewModel, imagenId = R.drawable.reverse)

//        for i in viewModel.cartasDeJugador {
//
//        }

        Row {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Dame Carta")
            }

            Button(onClick = { navController.navigate("SieteYMedio") }) {
                Text(text = "Pasar Turno")
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MostrarCarta(viewModel: SyMViewModel, imagenId: Int) {
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