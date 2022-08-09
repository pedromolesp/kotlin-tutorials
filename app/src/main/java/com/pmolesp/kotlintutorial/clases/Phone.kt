package com.pmolesp.kotlintutorial.clases

open class Phone(protected val number: Int) {

    fun call(){
        println("llamando")
    }
  open fun showNumber(){
        println(number)
    }
}