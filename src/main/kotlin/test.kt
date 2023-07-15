fun main() {
    val arr = ('A'..'Z')
    arr.printInOneLine()
}

fun CharRange?.printInOneLine() {
    this?.forEach {
        print("$it ")
    }
}