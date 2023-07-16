package collections

fun main() {
    val l = listOf("Hola", "Mundo", "En", "Kotlin")

    l.filter { it.length > 4 }.map { it.uppercase() }.forEach { print("$it ") }
    println()
    l.asSequence().filter { it.length > 4 }.map { it.uppercase() }.toList().forEach { print("$it ") }
    println()

    val l2 = (0.toChar()..255.toChar()).toList()

    l2.filterIndexed { index, _ -> index %2 == 0 }.map { it.uppercase() }.forEach { print("$it ") }
    l2.asSequence().filterIndexed { index, _ -> index %2 == 0 }.map { it.uppercase() }.toList().forEach { print("$it ") }
}