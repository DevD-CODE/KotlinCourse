package collections

fun main() {
    val l = listOf("Hola", "Mundo", "En", "Kotlin")

    println(l.slice(0..2))
    println(l.slice(setOf(0, 3)))
}