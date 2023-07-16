package collections

fun main() {
    val l = listOf("One", "Two", "Three", "Four", "Five", "Six")

    println(l.take(3))
    println(l.takeLast(3))
    println(l.drop(2))
    println(l.dropLast(2))

    println()

    println(l.takeWhile { it.length < 4 })
    println(l.takeLastWhile { it.length < 4 })
    println(l.dropWhile { it.length < 4 })
    println(l.dropLastWhile { it.length < 4 })
}