package collections

fun main() {
    val l = listOf(1, 2, 3, 4)

    println(l.count())
    println(l.sum())
    println(l.average())
    println(l.maxOrNull())
    println(l.minOrNull())

    println()

    val l2 = listOf("One", "Two", "Three", "Four")

    println(l2.count { it.length > 3 })
    println(l2.sumOf { it.length })
    println(l2.maxOf { it.length })
    println(l2.minOf { it.length })

    println()

    println(l2.fold(0) {sum, element -> sum+element.length})
    println(l.reduce { acc, i -> acc+i })
}