package collections

fun main() {
    val infinite = generateSequence(1) { it+1 }
    val finite = generateSequence(1) { if(it == 8) null else it+1 }
    infinite.take(100).forEach(::println)
    finite.forEach(::println)
}