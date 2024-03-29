package com.jorgearceruiz97.black_jack_jorgitorr.cardgames.data

/**
 * @property valorMin valor mínimo del naipe
 * @property valorMax valor máximo del naipe
 */
enum class Naipes(val valorMin:Int, val valorMax: Int){
    NINGUNA(0,0),
    AS(1,11),
    DOS(2,2),
    TRES(3,3),
    CUATRO(4,4),
    CINCO(5,5),
    SEIS(6,6),
    SIETE(7,7),
    OCHO(8,8),
    NUEVE(9,9),
    DIEZ(10,10),
    JOTA(10,10),
    REINA(10,10),
    REY(10,10);
}