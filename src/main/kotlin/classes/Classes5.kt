package classes

fun main() {
    val counter = Counter()
    counter.count = 5;
    counter.message = "Hola"
    counter.print()
}

class Counter() {
    var count : Int = 0
        set(value) {
        if(value != 0) field = value
    }

    var message : String = ""
    set(value) {
        if(value!= "") field = value
    }

    fun print() {
        for(i in 0 until count) {
            println(message)
        }
    }
}
