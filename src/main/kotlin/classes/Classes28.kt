package classes

fun main() {
    val list = PersonList(ArrayList<PersonData>())
    list.add(PersonData("John", 15))
    list.add(PersonData("Jane", 20))
    list.add(PersonData("Mary", 16))
    list.add(PersonData("Peter", 17))
    list.add(PersonData("Lisa", 22))

    list.printPeople()
}

data class PersonData(val name : String, val age : Int) {
    override fun toString(): String {
        return "name='$name', age=$age"
    }
}

class PersonList(private val people : MutableList<PersonData>) : MutableList<PersonData> by people {
    fun printPeople() {
        people.forEach(::println)
    }

    override fun add(element: PersonData): Boolean {
        if(element.age > 17) {
            people.add(element)
            return true
        }

        return false
    }
}