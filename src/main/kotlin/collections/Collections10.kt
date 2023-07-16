package collections

fun main() {
    val person = object {
        var name: String = "Daniel"
        var age: Int = 19

        override fun toString(): String {
            return "($name, $age)"
        }
    }

    val l = listOf("Hola", "Mundo", "En", "Kotlin", 12, 82.0, 82.12f, person)

    println(l)
    l.filter { it.toString().length > 4 }.toString().also { e -> println(e) }
    l.filterIsInstance<String>().filter { it.length > 4 }.map { it.uppercase() }.toString().also { i -> println(i) }

    if(l.any { it is String }) println("Yes, string")
    if(!l.none { it is Int }) println("Yes, int")
    if(l.filterIsInstance<String>().all { it.length > 1 }) println("Yes, len > 1")

    val (strings, noStrings) = l.partition { it is String }

    println(strings)
    println(noStrings)
}