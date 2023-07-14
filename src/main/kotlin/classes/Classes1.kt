package classes

fun main() {
    val obj = Order("Daniel")
}

class Order(private val name : String) {
    var str1 = "Hola $name".also(::println)

    init {
        println("Hola desde init 1")
    }

    var str2 = "Hola de nuevo $name".also(::println)

    init {
        println("Hola desde init 2")
    }
}