package builder

fun main() {
    build {
        name = "Daniel"
        age = 23
        address = "City1"
        phone = "3242424343"
    }.print()
}

fun build(init : Safe.() -> Unit) : Safe {
    val safe = Safe()
    safe.init()
    return safe
}

class Safe {
    var name : String = ""
    var age : Int = 0
    var address : String = ""
    var phone : String = ""

    fun print() {
        println("$name $age $address $phone")
    }
}