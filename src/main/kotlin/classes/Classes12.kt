package classes

fun main() {
    val student = Student("Daniel", 19, 100, "I.S.C")
    val (name, age, average, career) = student
    println("$name, $age, $average, $career")

    val student2 = Pair("Daniel", Triple(19, 100, "I.S.C"))
    println(student2.first)
    println(student2.second.first)
    println(student2.second.second)
    println(student2.second.third)
}

data class Student(val name : String, val age : Int, val average : Int, val career : String)