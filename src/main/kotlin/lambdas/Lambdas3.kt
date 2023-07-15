package lambdas

fun main() {
    val sum = {i : Int, j : Int -> i+j}
    val subtract = {i : Int, j : Int -> i-j}
    val multiply = {i : Int, j : Int -> i*j}
    val divide = {i : Int, j : Int -> i/j}
    val operate = fun(i : Int, j : Int ,l : (i : Int, j : Int) -> Int) { println(l(i, j)) }

    run {
        operate(1, 2, sum)
        operate(2, 1, subtract)
        operate(2, 2, multiply)
        operate(2, 2, divide)
    }
}