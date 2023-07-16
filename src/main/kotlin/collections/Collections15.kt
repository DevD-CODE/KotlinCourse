package collections

fun main() {
    val l = (1..24).toList()

    println(l)
    println(l.chunked(6))

    println(l.chunked(6) {it.sum()})
}