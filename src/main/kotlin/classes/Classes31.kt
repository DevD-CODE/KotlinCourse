package classes

import kotlin.properties.Delegates

fun main() {
    prop = "Valor específico"
    println(prop)
    prop = "Valor modificado"
    println(prop)
}

var prop : String by Delegates.observable("<init>") {_, old, new ->
    println("$old -> $new")
}