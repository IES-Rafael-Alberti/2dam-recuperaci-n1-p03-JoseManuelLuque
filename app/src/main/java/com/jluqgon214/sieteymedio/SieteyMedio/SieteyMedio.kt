package com.jluqgon214.sieteymedio.SieteyMedio

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.jluqgon214.sieteymedio.SieteyMedio.data.Baraja
import com.jluqgon214.sieteymedio.SieteyMedio.data.SyMViewModel

@Composable
fun SieteyMedio(viewModel: SyMViewModel) {

    Column {
        Button(onClick = {Baraja.startGame(viewModel.context.value!!) }) {
            Text(text = "A")
        }
    }
}