package collections

fun main() {
    val l = mutableListOf(1, 2, 3)
    val l2 = mutableListOf(4, 5, 6)

    println( (l - listOf(2, 3)) )
    println( (l2 - 5) )
    println()

    println( (l + l2) )
    println( (l2 + 7) )
    println()

    l+=l2

    println(l)
    println(l2)
}