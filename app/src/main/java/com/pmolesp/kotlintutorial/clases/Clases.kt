package com.pmolesp.kotlintutorial.clases

fun main() {
    val _phone: Phone = Phone(667667667)
    _phone.call()
    _phone.showNumber()

    val smartPhone = SmartPhone(664612349, true)
    smartPhone.call()
    smartPhone.showNumber()

}