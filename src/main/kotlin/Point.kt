data class Point(val x: Int, val y: Int)

infix fun Point.add(other: Point): Point {
    return Point(this.x + other.x, this.y + other.y)
}

fun main() {
    val point1 = Point(2, 3)
    val point2 = Point(4, 5)
    val sum1 = point1 add point2
    val sum2 = point1.add(point2)
    println("Sum: ${sum1.x}, ${sum1.y}") // Output: Sum: 6, 8
    println("Sum: ${sum2.x}, ${sum2.y}") // Output: Sum: 6, 8
}


