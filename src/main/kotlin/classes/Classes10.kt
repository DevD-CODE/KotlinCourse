package classes

fun main() {
    Connection(Host("192.168.88.18"), 22).connect()
}

class Host(private val hostname : String) {
    fun printHostname() {
        print(hostname)
    }
}

class Connection(private val host : Host, private val port : Int) {
    private fun printPort() {
        print(port)
    }

    private fun Host.printConnection() {
        printHostname()
        print(":")
        printPort()
    }

    fun connect() {
        host.printConnection()
    }
}