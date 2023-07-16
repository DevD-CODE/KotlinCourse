package collections

fun main() {
    val l = listOf(1, 2, 3, 4, 5)

    l.map { it * 2 }.forEach { print("$it ") }
    println()
    l.mapIndexed { index, value -> value * index }.forEach { print("$it ") }
    println()
    l.mapNotNull { if(it %2 == 0) it * 3 else null }.forEach { print("$it ") }
    println()

    val m = mapOf("Key1" to 1, "Key2" to 2, "Key3" to 3)
    m.mapKeys { it.key.uppercase() }.forEach { print("$it ") }
    println()
    m.mapValues { it.value * 2 }.forEach { print("$it ") }
}