package classes

sealed interface ReadResult
data class Number(val number: Int) : ReadResult
data class Text(val text: String) : ReadResult
object EndOfFile : ReadResult

fun printReadResult(r: ReadResult) {
    when(r) {
        is Number -> println("Num(${r.number}")
        is Text -> println("Txt(${r.text}")
        is EndOfFile -> println("EOF")
    }
}

fun main() {
    printReadResult(EndOfFile) // EOF
}