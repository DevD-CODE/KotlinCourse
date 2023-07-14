package functions

import kotlin.math.abs

fun main() {
    // Funciones básicas
    println(sum(1, 2))
    println(multiply(3, 4))

    // Funciones con argumentos por defecto
    println(greet("Alice"))
    println(greet("Bob", "Hola"))

    // Funciones de extensión
    val text = "Hello, World!"
    println(text.removeWhitespace())

    // Funciones de orden superior
    val numbers = listOf(1, 2, 3, 4, 5)
    val doubled = numbers.map { it * 2 }
    println(doubled)

    // Funciones de orden superior con receptores
    val absoluteValue = with(-5) {
        abs(this)
    }
    println(absoluteValue)
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun multiply(a: Int, b: Int): Int {
    return a * b
}

fun greet(name: String, greeting: String = "Hello"): String {
    return "$greeting, $name!"
}

fun String.removeWhitespace(): String {
    return replace(" ", "")
}

tailrec fun getFactorial(n : Int, acc : Int = 1) : Int {
    if(n == 0) return acc
    return getFactorial(n - 1, acc * n)
}