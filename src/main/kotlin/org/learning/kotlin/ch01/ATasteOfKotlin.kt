package org.learning.kotlin.ch01

data class Person(val name: String,
                  val age: Int? = null)

fun main(args: Array<String>) {
    val persons = listOf(
            Person(name = "Anna"),
            Person(name = "Stacey", age = 31))

    val oldest = persons.maxByOrNull { it.age ?: 0 }

    println("The oldest is: $oldest")

}
