package classes

fun main() {
    val box = Box(1)
    println(box)

    val box2 = Box("Hola mundo")
    println(box2)

    box2.print()
}

fun <T> Box<T>.print() {
    println(this.toString())
}

class Box<T>(private var t : T) {
    fun get() = t

    fun set(t : T) {
        this.t = t
    }

    override fun toString(): String {
        return "Box(t=$t)"
    }
}