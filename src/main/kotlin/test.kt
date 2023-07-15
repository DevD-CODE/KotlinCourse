fun main() {
    val arr = ('A'..'Z')
    arr.printInOneLine()

    val c = MClass::class
    println(c)
}

fun CharRange?.printInOneLine() {
    this?.forEach {
        print("$it ")
    }
}

class MClass {

}