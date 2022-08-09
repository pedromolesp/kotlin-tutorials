package com.pmolesp.kotlintutorial

import kotlin.math.abs


fun main() {
val c = -3
    val b :Double = 2.0
    println(c.enableAbs(true))
    println(b.enableAbsDouble(true))
    showProduct("Soda","10%")
    showProduct("Pan")
    showProduct("Caramelo","15%")
    showProduct("Zumo",validity = "15 de Marzo")
}

infix fun Int.enableAbs(enable: Boolean)= if(enable)abs(this) else this
infix fun Double.enableAbsDouble(enable: Boolean)= if(enable)abs(this) else this

fun showProduct(name:String, promo:String = "Sin promocion", validity:String = "agotar existencias"){
    println("$name = $promo hasta $validity")
}
