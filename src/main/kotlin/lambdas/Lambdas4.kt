package lambdas

inline fun doAction(action: () -> Unit) {
    action.invoke()
}

fun main() {
    println("Hola")
    doAction {
        println("Hello")
        println("World")
    }
    println("Adios")
}