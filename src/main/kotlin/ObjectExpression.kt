open class Shape {
    open fun draw() {
        println("Drawing shape...")
    }
}

fun main() {
    val drawable = object : Shape() {
        override fun draw() {
            println("Drawing rectangle...")
        }

        fun fill() {
            println("Filling rectangle with color...")
        }
    }

    drawable.draw() // Kết quả: "Drawing rectangle..."
    drawable.fill() // Kết quả: "Filling rectangle with color..."
}