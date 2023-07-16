package collections

fun main() {
    val l = listOf(2, 4, 1, 10, 41, 4, 2, 0, 9)
    val l2 = listOf("Hola", "Mundo", "En", "Kotlin")
    val lenComparator = Comparator { str1 : String, str2 : String -> str1.length - str2.length }

    println(l2.sortedWith(lenComparator))
    println(l.sorted())
    println(l2.sortedBy { it.length })
    println(l2.sortedByDescending { it.length })
    println(l.reversed())
    println(l2.shuffled())
}