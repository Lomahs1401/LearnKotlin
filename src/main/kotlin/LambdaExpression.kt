fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

fun containEvenNumber(numbers: List<Int>): List<Int> {
    return numbers.filter {
        val isEvenNumbers = it % 2 == 0
        println(isEvenNumbers)
        return@filter isEvenNumbers
    }
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    val evenNumbers = containEvenNumber(numbers)
    println(evenNumbers) // Output: [2, 4, 6]
}