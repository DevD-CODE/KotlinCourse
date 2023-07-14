package classes

fun main() {
    val passwd = Password("DevD")
    println(passwd)
}

@JvmInline value class Password(private val passwd : String) {
    override fun toString(): String {
        return this.passwd
    }
}