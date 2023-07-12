package types

fun main() {
    val array = Array(5) {i -> (i + 1)}
    array.forEach {println(it)}

    println()

    val array2 = intArrayOf(1, 2, 3, 4, 5)
    array2.forEach {println(it)}

    println()
    println(array[0])
}