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
    val concatenateDog2 : Dog.(Dog) -> Dog = Dog::concatenate
    val dog3 = dog.concatenateDog(dog2)
    val dog4 = dog.concatenateDog2(dog2)
    val dog5 = dog + dog2
    println(dog3)
    println(dog4)
    println(dog5)
}

data class Dog(val name : String, val age : Int) {
    override fun toString(): String = "$name, $age"

    fun concatenate(other: Dog) = Dog(name + other.name, age + other.age)
    operator fun plus(other : Dog) = this.concatenate(other)
}

val myFunc : () -> Unit = { println("Hello World") }

val myFunc2 : () -> Unit = { println("Other print") }

fun doSomething(func : () -> Unit) {
    func()
}