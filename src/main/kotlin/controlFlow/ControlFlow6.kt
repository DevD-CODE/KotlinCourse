package controlFlow

fun main() {
    val x = 10
    for(i in 1..20) {
        if(i == x) break
        if(i == x-2) continue
        println(i)
    }

    println()

    l@ for(i in 1..20) {
        for(j in 1..20) {
            if(i == x-2 && j == x-1) {
                println(i+j)
                break@l
            }
        }
        if(i == x) {
            println(i)
            break
        }
    }
}