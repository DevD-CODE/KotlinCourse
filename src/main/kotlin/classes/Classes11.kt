package classes

fun main() {
    val usr = User("DevD", "DevD123")
    println(usr)

    val (user, passwd) = usr
    println(user)
    println(passwd)
}

data class User(val user : String, val passwd : String)