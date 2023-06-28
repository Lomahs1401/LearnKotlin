// Extension function cho lớp String
fun String.addWelcomePrefix(): String {
    return "Welcome, $this"
}

fun Int.isEven(): Boolean {
    return this % 2 == 0
}

fun main() {
    val name = "John"
    val welcomeMessage = name.addWelcomePrefix()
    println(welcomeMessage) // Output: Welcome, John

    val number = 5
    val isNumberEven = number.isEven()
    println(isNumberEven) // Output: false
}

