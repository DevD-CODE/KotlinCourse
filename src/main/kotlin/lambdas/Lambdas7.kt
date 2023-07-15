package lambdas

inline fun <reified T> printType() {
    println(T::class.simpleName)
}

fun main() {
    printType<String>() // Imprime "String"
    printType<Int>() // Imprime "Int"
}