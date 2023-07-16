package collections

fun main() {
    val l = listOf("Red", "Green", "Blue")
    val l2 = listOf("Fox", "Bear", "Cat")
    val l3 = l.zip(l2)

    println(l3.toMap())
    println(l3.unzip())

    println(l.zip(l2) {
        e1, e2 ->
        "The $e2 is $e1"
    }.toString())
}