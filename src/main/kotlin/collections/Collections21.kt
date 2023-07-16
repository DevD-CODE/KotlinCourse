package collections

fun main() {
    val l = (1..100).toList()
    l.sorted()

    println(l.binarySearch(50))
}