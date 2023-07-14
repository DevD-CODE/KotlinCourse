package classes

fun main() {
    val s : Person1 = Student1("Daniel", 22610584)
    println(s)
}

abstract class Person1(private var name : String) {

}

open class Student1(private var name : String, private var id : Int) : Person1(name) {
    override fun toString(): String {
        return "Student1(name=$name, id=$id)"
    }
}

class Uni(private var name: String, private var id : Int) : Student1(name, id) {

}