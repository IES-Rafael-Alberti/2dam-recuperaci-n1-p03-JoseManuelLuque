package com.jluqgon214.sieteymedio.SieteyMedio.data

import android.content.Context
import android.util.Log

/**
 * Métodos:
 *
 * - crearBaraja() => Generar la lista de 52 cartas de la baraja.
 * - barajar() => Desordenar las cartas de la lista de cartas de la baraja (shuffle)
 * - dameCarta() => Retorna la última carta de la lista de cartas y la elimina de la baraja.
 */
class Baraja {
    companion object {
        var listaCartas = ArrayList<Carta>()
        fun crearBaraja(context: Context) {
            //Limpiamos la baraja por si hubiera una creada
            listaCartas.clear()

            for (palo in Palos.values()) {
                for ((indice, numero) in Naipes.values().withIndex()) {
                    val carta = Carta(
                        numero,
                        palo,
                        getCardPoints(),
                        0
                    )
                    carta.idDrawable = getIdDrawable(context, "${carta.palo.name[0].toLowerCase()}${indice+1}")
                    listaCartas.add(carta)
                    Log.e("Id Carta", "${carta.nombre} ${carta.palo} ${carta.idDrawable}")
                }
            }
        }

        private fun getIdDrawable(context: Context, nombreCarta: String): Int {
            return context.resources.getIdentifier(
                nombreCarta,
                "drawable",
                context.packageName
            )
        }

        fun getCardPoints(): Double{
            for(valor in 1..10) {
                when(valor){
                    1 -> return valor.toDouble()
                    2 -> return valor.toDouble()
                    3 -> return valor.toDouble()
                    4 -> return valor.toDouble()
                    5 -> return valor.toDouble()
                    6 -> return valor.toDouble()
                    7 -> return valor.toDouble()
                    8 -> return 0.5
                    9 -> return 0.5
                    10 -> return 0.5
                }
            }
            return 100.00
        }

        fun barajar() {
            listaCartas.shuffle()
        }

        fun dameCarta(): Carta {
            val carta = listaCartas.last()
            listaCartas.removeLast()
            return carta
        }

        fun borrarBaraja() {
            listaCartas.clear()
        }

        fun startGame(context: Context) {
            crearBaraja(context)
            barajar()
        }
    }
}