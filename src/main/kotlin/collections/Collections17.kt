package collections

fun main() {
    val l = listOf("One", "Two", "Three", "Four", "Five", "Six")

    println(l.elementAt(0))
    println(l.elementAtOrElse(10) {"Not found"})
    println(l.elementAtOrNull(100))

    println()

    println(l.first())
    println(l.last())

    println()

    println(l.find { it.length > 4 })
    println(l.findLast { it.length == 4 })

    println()

    println(l.firstNotNullOf { it.uppercase().takeIf { i -> i.length > 4 } })
}