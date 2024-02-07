package com.jluqgon214.sieteymedio.SieteyMedio.ui

import android.app.Application
import android.content.Context
import android.widget.Toast
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.jluqgon214.sieteymedio.R
import com.jluqgon214.sieteymedio.SieteyMedio.dataSyM.Baraja
import com.jluqgon214.sieteymedio.SieteyMedio.dataSyM.Carta

class SyMViewModel(application: Application) : AndroidViewModel(application) {
    val context = MutableLiveData<Context>(getApplication<Application>().applicationContext)
    val gameStarted = MutableLiveData<Boolean>(false)
    val winner = MutableLiveData<Any>()

    val _showWinnerDialog = MutableLiveData<Boolean>()
    val showWinnerDialog : LiveData<Boolean> = _showWinnerDialog

    private val _imageDesc = MutableLiveData<String>()
    val imageDesc : LiveData<String> = _imageDesc

    private val _imageIdJugador = MutableLiveData<Int>()
    val imageIdJugador : LiveData<Int> = _imageIdJugador

    private val _imageIdBanca = MutableLiveData<Int>()
    val imageIdBanca : LiveData<Int> = _imageIdBanca


    var cartaJugador = MutableLiveData<Carta>()
    var cartaBanca = MutableLiveData<Carta>()

    var cartasDeJugador =  mutableListOf<MutableLiveData<Carta>>()
    var cartasDeBanca = mutableListOf<MutableLiveData<Carta>>()

    fun getCard() {
        cartaJugador.value = Baraja.dameCarta()
        _imageIdJugador.value = cartaJugador.value?.idDrawable
        cartasDeJugador.add(cartaJugador)

        cartaBanca.value = Baraja.dameCarta()
        _imageIdBanca.value = cartaBanca.value?.idDrawable
        cartasDeBanca.add(cartaBanca)
    }

    init {
        Reiniciar(context.value!!)
    }
    fun Reiniciar(context: Context) {
        getReverseCard()
        Baraja.borrarBaraja()
        Baraja.crearBaraja(context = context)
        Baraja.barajar()
    }
    
    fun getReverseCard(){
        cartaJugador.value?.idDrawable = R.drawable.reverse
        _imageIdJugador.value = R.drawable.reverse
        cartaBanca.value?.idDrawable = R.drawable.reverse
        _imageIdBanca.value = R.drawable.reverse
    }

    fun CalcularPuntos(): Int{
        if(cartaJugador.value?.puntos!! > cartaBanca.value?.puntos!!) {
            return 1
        }
        return if(cartaJugador.value?.puntos!! < cartaBanca.value?.puntos!!) {
            2
        } else{
            0
        }
    }

    fun ComprobarGanador() {
        if (gameStarted.value == false) {
            Baraja.startGame(context.value!!)
            gameStarted.value = true
        }
        if (Baraja.listaCartas.isEmpty()) {
            Toast.makeText(
                context.value,
                "No quedan cartas en la baraja",
                Toast.LENGTH_LONG
            ).show()
        } else {
            if (CalcularPuntos() == 1) {
                _showWinnerDialog.value = true
                winner.value = 1
            }
            if (CalcularPuntos() == 2) {
                _showWinnerDialog.value = true
                winner.value = 2
            }
            if (CalcularPuntos() == 0) {
                _showWinnerDialog.value = true
                winner.value = "Ninguno, Empate"
            }
        }
    }
}