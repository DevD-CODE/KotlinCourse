package controlFlow

fun main() {
    val a = 14
    val b = 13
    var max = 0

    if(a > b) max = a
    else max = b

    max = if(a > b) a else b

    println(max)
}