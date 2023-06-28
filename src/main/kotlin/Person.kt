class Person(private val firstName: String = "Peter", private val lastName: String = "Parker") {
    var nickName: String? = null
        set(value) {
            field = value
            println("the new nickname is $value")
        }
        get() {
            println("the returned value is $field")
            return field
        }

    fun printInfo() {
        val nickNameToPrint = nickName ?: "no nickname"
        println("$firstName ($nickNameToPrint) $lastName")
    }
}

fun main() {
    val person = Person()
    person.nickName = "Lomahs"
    person.printInfo() // Output: Peter (Lomahs) Parker
}

