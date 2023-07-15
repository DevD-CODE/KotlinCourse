package lambdas

fun main() {
    doSomething(myFunc)
    doSomething(myFunc2)

    val dog = Dog("Firu", 2)
    val dog2 = Dog("lais", 2)
    println(dog)
    println(dog2)

    println()

    val concatenateDog : Dog.(Dog) -> Dog = { Dog(this.name + it.name, this.age + it.age) }
    val concatenateDog2 : Dog.(Dog) -> Dog = Dog::plus
    val dog3 = dog.concatenateDog(dog2)
    val dog4 = dog.concatenateDog2(dog2)
    println(dog3)
    println(dog4)
}

data class Dog(val name : String, val age : Int) {
    override fun toString(): String = "$name, $age"

    fun plus(other: Dog) = Dog(name + other.name, age + other.age)
}

val myFunc : () -> Unit = { println("Hello World") }

val myFunc2 : () -> Unit = { println("Other print") }

fun doSomething(func : () -> Unit) {
    func()
}