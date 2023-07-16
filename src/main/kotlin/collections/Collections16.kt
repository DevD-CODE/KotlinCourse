package collections

fun main() {
    val l = listOf("One", "Two", "Three", "Four", "Five", "Six", "Seventh")

    println(l.windowed(2, 2))
    println(l.windowed(2))
    println(l.zipWithNext())
}