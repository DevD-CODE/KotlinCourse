package controlFlow

fun main() {
    val x = 4

    when(x) {
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        4 -> println("Four")
        5 -> println("Five")
        6 -> println("Six")
        else -> {
            println("Default")
        }
    }
}