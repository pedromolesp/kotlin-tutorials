package com.pmolesp.kotlintutorial

fun main() {
    showPerson("Pedro","Jonna","Antoñito")
    showPersonList("Pedro","Jonna","Antoñito", "Rosario")
}

fun showPerson(p1: String, p2: String, p3: String) {
    println(p1)
    println(p2)
    println(p3)
}
fun showPersonList(vararg  persons:String) {
    for (person in persons){
        println("$person, ")
    }
    var index = 0
    while (index < persons.size){
        println(persons[index])
        index++
    }

    index = (0..persons.size - 1).random()
    println(index)
    when(persons[index]){
        "Pedro" -> println("Es Pedro")
        "Jonna" -> println("Es Jonna el traidor")
        "Antoñito" -> {
            println("La concha")
            println("que estaba vacío")
        }
        else ->
            println("Quién será")
    }
}