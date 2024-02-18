package com.jluqgon214.sieteymedio.SieteyMedio.dataSyM.data

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.jluqgon214.sieteymedio.R
import com.jluqgon214.sieteymedio.SieteyMedio.ui.SyMViewModel

@Composable
fun SieteYMedio(SyMViewModel: SyMViewModel, navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Jugador")
        Spacer(Modifier.size(10.dp))
        MostrarCarta(viewModel = SyMViewModel, imagenId = R.drawable.reverse)

        Spacer(Modifier.size(40.dp))

        Text(text = "Banca")
        Spacer(Modifier.size(10.dp))
        MostrarCarta(viewModel = SyMViewModel, imagenId = R.drawable.reverse)

        Spacer(Modifier.size(20.dp))
        Row {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Turno Jugador")
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
