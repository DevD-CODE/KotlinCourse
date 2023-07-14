package classes

fun main() {
    Out2().Inner().foo()
    Out.Nested().bar()
}

class Out2() {
    val foo = "foo"

    inner class Inner() {
        fun foo() {
            println(foo)
        }
    }
}

class Out() {
    fun foo() {
        println("foo")
    }

    class Nested() {
        fun bar() {
            println("bar")
        }
    }
}