package controlFlow

enum class BITS {
    ZERO, ONE
}

fun main() {
    val x = BITS.ONE
    val b = when(x) {
        BITS.ZERO -> "0"
        BITS.ONE -> "1"
    }

    println(b)
}