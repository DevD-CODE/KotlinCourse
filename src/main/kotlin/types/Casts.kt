package types

fun main() {
    var str: String? = null

    println(str is String)

    str = "ABC"

    println(str is String)

    val change = 12
    val box: String? = change as? String

    println(box)
}