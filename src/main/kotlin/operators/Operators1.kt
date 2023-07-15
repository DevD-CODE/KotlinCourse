package operators

fun main() {
    val point = Point(82, 82)
    println(point)

    point.transform(-point)
    println(point)
}

data class Point(var x : Int, var y : Int) {
    override fun toString(): String {
        return "Point(x=$x, y=$y)"
    }

    fun transform(point : Point) {
        x = point.x
        y = point.y
    }
}

operator fun Point.unaryMinus() = Point(-x, -y)
operator fun Point.inc() = Point(x+1, y+1)
operator fun Point.dec() = Point(x-1, y-1)