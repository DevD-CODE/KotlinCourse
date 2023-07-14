package classes

fun main() {
    S1.foo()
    S1.bar()
}

// This is a singleton pattern
object S1 {
    fun foo() {
        println("foo")
    }

    fun bar() {
        println("bar")
    }
}