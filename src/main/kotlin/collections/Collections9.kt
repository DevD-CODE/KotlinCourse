package collections

import kotlin.math.pow

fun main() {
    val l = listOf(setOf(1, 2, 3), setOf(4, 5, 6), setOf(7, 8, 9))

    println(l.flatten())
    println(l.flatMap { it.toList().map { i -> i.toDouble().pow(2).toInt() } })

    val str = StringBuffer("List: ")
    print(l.flatten().joinTo(str))
}