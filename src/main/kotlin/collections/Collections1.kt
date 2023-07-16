package collections

fun main() {
    var lI = listOf(1, 2, 3, 4, 5, 6)
    lI = List<Int>(6) {it + 1}
    lI = buildList {
        add(1)
        add(2)
        add(3)
        add(4)
        add(5)
        add(6)
    }
    lI = ArrayList<Int>(listOf(1, 2, 3, 4, 5, 6))
    lI.forEach(::println)

    val map = mutableMapOf<String, Int>("Key1" to 1, "Key2" to 2, "Key3" to 3)
    for((key, value) in map) {
        println("$key -> $value")
    }
    map["Key4"] = 4 // map.put("Key4", 4)

    val set = setOf(1, 2, 3, 4)
    set.forEach(::println)

    println()

    val listWithNull = listOf("Lol", "Ekisde", null)
    val iterator = listWithNull.iterator()
    while(iterator.hasNext()) {
        println(iterator.next()?.length ?: "None")
    }
}