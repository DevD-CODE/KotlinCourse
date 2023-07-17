package lambdas

inline fun doActionDouble(action1 : () -> Unit, noinline action2 : () -> Unit) : () -> Unit {
    action1.invoke()
    action2.invoke()
    val ac2 = action2
    return ac2
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