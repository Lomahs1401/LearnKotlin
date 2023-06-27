class MyClass {
    companion object {
        private const val MAX_COUNT = 10

        fun printMaxCount() {
            println("Max count is: $MAX_COUNT")
        }
    }

    fun doSomething() {
        MyClass.printMaxCount() // Truy cập thành phần trong companion object
    }
}

fun main() {
    MyClass.printMaxCount() // Truy cập thành phần trong companion object từ bên ngoài lớp
}