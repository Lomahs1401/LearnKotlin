fun main() {
    // Higher-Order Function nhận một hàm như đối số
    fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
        return operation(a, b)
    }

    // Lambda expression được truyền vào như một đối số
    val sum = calculate(10, 5) { x, y ->
        val temp = x + y
        println("Calculatin Sum")
        temp
    }
    println("Sum: $sum") // Output: Sum: 15

    // Higher-Order Function trả về một hàm
    fun multiplyBy(factor: Int): (Int) -> Int {
        return { number -> number * factor }
    }

    val multiplyByTwo = multiplyBy(2)
    val result = multiplyByTwo(5)
    println("Result: $result") // Output: Result: 10
}