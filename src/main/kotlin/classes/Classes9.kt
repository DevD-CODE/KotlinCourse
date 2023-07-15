package classes

fun main() {
    val array = Array(10) {i -> i+1}
    println(array.sum(2, 6))
}

fun Array<Int>.sum(i : Int, j : Int) : Int {
    return this[i] + this[j]
}