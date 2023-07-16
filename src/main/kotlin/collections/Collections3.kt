package collections

fun main() {
    val s = sequence {
        yield(1)
        yield(2)
        yieldAll(listOf(3, 4, 5, 6))
        yieldAll(generateSequence(1) { it+1 })
    }
    s.take(5).forEach(::println)
}