package classes

interface A_ {
    fun funFromA()
}
interface B_

class C_ {
    // The return type is Any; x is not accessible
    fun getObject() = object {
        val x: String = "x"
    }

    // The return type is A; x is not accessible
    fun getObjectA() = object: A_ {
        override fun funFromA() {}
        val x: String = "x"
    }

    // The return type is B; funFromA() and x are not accessible
    fun getObjectB(): B_ = object: A_, B_ { // explicit return type is required
        override fun funFromA() {}
        val x: String = "x"
    }
}