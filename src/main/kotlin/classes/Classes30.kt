package classes

fun main() {
    println(lazyVal)
    println(lazyVal)
}

val lazyVal : String by lazy {
    println("realizando un cómputo muy difícil, wow que difícil")
    "STRINGCONNECTION"
}