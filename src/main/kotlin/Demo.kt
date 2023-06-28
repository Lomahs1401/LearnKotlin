open class A {
    open fun foo(i: Int = 10) {
        println(i)
    }
}

class B : A() {
    override fun foo(i: Int) {
        super.foo(i)
    }
}



fun printNumbers(vararg numbers: Int) {
    numbers.forEach {
        print("$it ")
    }
}

fun printProgrammingLanguages(vararg listLanguages: String) {
    listLanguages.forEach { language ->
        print("$language ")
    }
}

fun calculateSum(a: Int, b: Int): Int {
    val result = a + b
    return result
}

fun main() {
    val sum = calculateSum(10, 5)
    println(sum)
}