package classes

import kotlin.properties.Delegates

fun main() {
    max = 12
    println(max)
    max = 11
    println(max)
}

var max : Int by Delegates.vetoable(0) {
        _, old, new ->
    old < new
}