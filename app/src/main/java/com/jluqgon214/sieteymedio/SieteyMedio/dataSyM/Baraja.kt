package com.jluqgon214.sieteymedio.SieteyMedio.dataSyM

import android.content.Context

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
                        getPuntos(indice),
                        0
                    )
                    carta.idDrawable =
                        getIdDrawable(context, "${carta.palo.name[0].lowercaseChar()}${indice + 1}")
                    listaCartas.add(carta)
                }
            }
        }

        fun getPuntos(indice: Int):Double {
            when (indice) {
                1 -> return (indice + 1).toDouble()
                2 -> return (indice + 1).toDouble()
                3 -> return (indice + 1).toDouble()
                4 -> return (indice + 1).toDouble()
                5 -> return (indice + 1).toDouble()
                6 -> return (indice + 1).toDouble()
                7 -> return (indice + 1).toDouble()
                8 -> return 0.5
                9 -> return 0.5
                10 -> return 0.5
                else -> Exception("Error")
            }
            return 0.0
        }

        private fun getIdDrawable(context: Context, nombreCarta: String): Int {
            return context.resources.getIdentifier(
                nombreCarta,
                "drawable",
                context.packageName
            )
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