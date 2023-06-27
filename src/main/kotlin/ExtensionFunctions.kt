// Extension function cho lớp String
fun String.addWelcomePrefix(): String {
    return "Welcome, $this"
}

// Extension function cho lớp Int
fun Int.isEven(): Boolean {
    return this % 2 == 0
}

fun main() {
    val name = "John"
    val welcomeMessage = name.addWelcomePrefix()
    println(welcomeMessage) // Kết quả: Welcome, John

    val number = 5
    val isNumberEven = number.isEven()
    println(isNumberEven) // Kết quả: false
}