fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun multiplyBy(factor: Int): (Int) -> Int {
    return { number -> number * factor }
}

fun main() {
    val multiplyByTwo = multiplyBy(2)
    val result = multiplyByTwo(5)
    println("Result: $result") // Output: Result: 10

    val sum = calculate(10, 5) { x, y -> x + y }
    println("Sum: $sum") // Output: Sum: 15
}







