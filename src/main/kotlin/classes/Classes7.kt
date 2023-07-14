package classes

fun main() {
    val eval = IntPredicate { it %2 == 0 }
    println(eval.accept(1))
    println(eval.accept(2))
}

fun interface IntPredicate {
    fun accept(i : Int) : Boolean
}