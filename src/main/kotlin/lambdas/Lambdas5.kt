package lambdas

inline fun doActionDouble(action1 : () -> Unit, noinline action2 : () -> Unit) : () -> Unit {
    action1.invoke()
    action2.invoke()
    return action2
}

fun main() {
    doActionDouble({
       print("Hello ")
       println("World")
    }, {
        print("Hola ")
        println("Mundo")
    }).invoke()
}