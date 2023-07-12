package controlFlow

fun main() {
    val array = Array(6) {i -> i+1}

    array.forEach { println(it) }
    println()
    for(value in array) println(value)
    println()
    for(i in 1..10) println(i)
    println()
    for (i in array.indices step 2) println(array[i])
}