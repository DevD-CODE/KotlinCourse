package classes

fun main() {
    val person = object {
        var name: String = "Daniel"
        var age: Int = 19
    }

    println(person.name)
    println(person.age)
}