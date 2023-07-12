package exceptions

fun main() {
    val a = 2
    val b = 2
    var c = 0

    try {
        c = divide(a, b)
    } catch (e: java.lang.IllegalArgumentException) {
        println(e.message)
    } finally {
        println(c)
    }
}

fun divide(a : Int, b : Int) : Int {
    if(a == 0 || b == 0) throw java.lang.IllegalArgumentException("NO ZERO!!")
    return a / b
}