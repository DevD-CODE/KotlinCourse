package classes

fun main() {
    val btn = object : Button() {
        override fun consume() {
            println("Clicked")
        }
    }

    btn.consume()
}

abstract class Button {
    abstract fun consume()
}