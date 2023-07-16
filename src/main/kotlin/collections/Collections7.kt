package collections

fun main() {
    var l = listOf("Hola", "Mundo", "En", "Kotlin")

    l = l.map { it.uppercase() }
    println(l)

    println(l.associateWith { it.length })
    println(l.associateBy { it.length })
    println(l.associateBy(keySelector = {it.first()}, valueTransform = {it.length*2}))
}