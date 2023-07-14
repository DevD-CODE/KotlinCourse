package classes

fun main() {
    val c = MyClassEx()
    c.oldProp = "Daniel"
    println(c.newProp)
}

class MyClassEx {
    @Deprecated("Use 'newProp' instead", ReplaceWith("newProp"))
    var oldProp : String = "Daniel"

    var newProp : String by this::oldProp
}