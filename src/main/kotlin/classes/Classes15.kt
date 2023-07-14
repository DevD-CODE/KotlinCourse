package classes

enum class Bits() {
    BIT_0,
    BIT_1,
    BIT_2,
    BIT_3,
    BIT_4
}

fun main() {
    val bits = Bits.values()
    bits.forEach(::println)
}