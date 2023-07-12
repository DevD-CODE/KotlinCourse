package controlFlow

fun main() {
    var x = 10
    while(x >= 0) {
        println(x)
        x--
    }

    println()

    x = 10
    do {
        println(x)
        x--
    } while(x >= 0)
}