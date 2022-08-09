package com.pmolesp.kotlintutorial.clases

class SmartPhone(number: Int,val isPrivate: Boolean):Phone(number) {
    override fun showNumber() {
        if(isPrivate) println("Desconocido") else super.showNumber()
    }
}