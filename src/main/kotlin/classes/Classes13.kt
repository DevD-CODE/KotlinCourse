package classes

sealed class Result
data class Success(val data: String) : Result()
data class Error(val message: String) : Result()

fun processResult(result: Result) {
    when (result) {
        is Success -> println("Operación exitosa. Datos: ${result.data}")
        is Error -> println("Error: ${result.message}")
    }
}

fun main() {
    val result1: Result = Success("Datos exitosos")
    val result2: Result = Error("Algo salió mal")

    processResult(result1)
    processResult(result2)
}
