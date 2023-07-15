package lambdas

inline fun doAny(crossinline action1 : () -> Unit, action2 : () -> Unit) {
    val nestedFunc : () -> Unit = {
        println("Compute something")
        action1.invoke()
    }
    nestedFunc.invoke()
    action2.invoke()
}

fun main() {
    doAny({ println("Do something") }, { println("Do something else") })
}