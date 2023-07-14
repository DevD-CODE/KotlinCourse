package classes

fun main() {
    val user = MutableUser(mutableMapOf(
        "username" to "DevD",
        "password" to "DevD123"
    ))

    println(user.username)
    println(user.password)

    user.username = "DevD2"
    user.password = "<PASSWORD>"

    println(user.username)
    println(user.password)
}

class MutableUser(map : MutableMap<String, Any?>) {
    var username : String by map
    var password : String by map
}