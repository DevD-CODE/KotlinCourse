package classes

import kotlin.reflect.KProperty

fun main() {
    val c = AnotherClass()
    println(c.prop)
    c.prop = "si"
    println(c.prop)
}

class AnotherClass {
    var prop : String by OneClass("<VALUE>")
}

class OneClass(private var value : String) {
    operator fun getValue(ref : Any, prop : KProperty<*>) : String {
        println("Propiedad ${prop.name} donde la referencia es $ref")
        return value
    }

    operator fun setValue(ref : Any, prop : KProperty<*>, value : String) {
        println("Propiedad ${prop.name} donde la referencia es $ref")
        this.value = value
    }
}