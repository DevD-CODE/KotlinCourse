package classes

fun main() {
    val c = C()
    c.foo()
}

interface A {
    fun foo() {
        println("A")
    }
}

interface B {
    fun foo() {
        println("B")
    }
}

class C() : A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
        println("C")
    }
}