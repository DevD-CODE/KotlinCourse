package classes

fun main() {
    val array = Array(10) {i -> i+1}
    println(array.sum(array[2], array[6]))
}

fun Array<Int>.sum(a : Int, b : Int) : Int {
    return a + b
}