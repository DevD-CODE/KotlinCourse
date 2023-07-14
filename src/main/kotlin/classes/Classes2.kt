package classes

fun main() {
    val p1 = Person("Daniel", 18)
    println(p1)

    p1.setName("Danilo")
    p1.setAge(19)

    println(p1)
}

class Person(private var name : String, private var age : Byte) {
    fun setName(name : String) {
        this.name = name
    }

    fun getName() : String {
        return this.name
    }

    fun setAge(age : Byte) {
        this.age = age
    }

    fun getAge() : Byte {
        return this.age
    }

    override fun toString(): String {
        return "Person(name=$name, age=$age)"
    }
}