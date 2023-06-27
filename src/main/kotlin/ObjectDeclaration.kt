object Logger {
    fun log(message: String) {
        println("[LOG]: $message")
    }

    var level: Int = 0
        set(value) {
            field = if (value >= 0) value else 0
        }
}

fun main() {
    Logger.log("Application started")
    Logger.level = 2
    Logger.log("Error occurred")
}