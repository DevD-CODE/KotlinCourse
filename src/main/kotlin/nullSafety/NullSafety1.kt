package nullSafety

fun main() {
    val a : String? = null

    val l = a?.length ?: -1
    println(l)

    val c : String = a as? String ?: "NULL"
    println(c)

    val l2 = a!!.length
}