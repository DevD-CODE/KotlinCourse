package classes

fun main() {
    val s = Singleton.instance
}

class Singleton private constructor(val name : String, val age : Int) {
    companion object Instance {
        val instance = Singleton("Daniel", 19)
    }
}