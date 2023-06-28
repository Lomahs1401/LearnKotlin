val name = "Long"
var greeting: String? = null

fun sayHello(greeting: String, itemsToGreet: List<String>) {
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun greetPerson(greeting: String = "Hello", name: String = "Kotlin") {
    println("$greeting $name")
}

//fun greetPerson(greeting: String = "Hello", name: String = "Kotlin") = println("$greeting $name")

fun addition(a: Int, b: Int): Int {
    val total = a + b
    println("Sum of $a + $b = $total")
    return total
}

fun <T> printList(list: List<T>) {
    list.forEach {
        println("$it ")
    }
}

//fun printList(list: List<Int>) {
//    list.forEach {
//        println("$it ")
//    }
//}
//
//fun printList(list: List<String>) {
//    list.forEach {
//        println("$it ")
//    }
//}

fun main(args: Array<String>) {
    val numbers = listOf(1, 2, 3, 4, 5)
    printList(numbers) // Output: 1 2 3 4 5

    val languages = listOf("Kotlin", "Java", "Javascript")
    printList(languages) // Output: Kotlin Java Javascript

    addition(2, 3)
}
//fun main(args: Array<String>) {
//    val greetingToPrint = when (greeting) {
//        null -> {
//            println("1")
//            "Hi "
//        }
//        else -> {
//            println("2")
//            greeting
//        }
//    }
//    print(greetingToPrint)
//    println(name)
//
//    greetPerson(name = "Lomahs", greeting = "Welcome back")
//
//    var numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)
//
//    val collection = arrayListOf(1, 2, 3, 4)
//    val interestingThings = listOf("Kotlin", "Java", "PHP")
//    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
//    map.forEach { key, value -> println("$key -> $value") }
//    interestingThings.forEach {interestingThing ->
//        print(interestingThing)
//        print(" ")
//    }
//    println()
//    interestingThings.forEachIndexed { index, interestingThing ->
//        println("$interestingThing is at index $index")
//    }
//    println()
//    sayHello("Hi", interestingThings)
//    for (item in collection) {
//        print("$item ")
//    }
//    println()
//    for (item: Int in collection) print("$item ")
//    println()
//
//    for (item in 1.. 4) {
//        print("$item ")
//    }
//    println()
//    for (item in 6 downTo 0 step 1) {
//        print("$item ")
//    }
//    println()
//    for (i in collection.indices) {
//        print("$i ")
//    }
//    println()
//    for ((index, value) in collection.withIndex()){
//        println("index: $index is $value")
//    }
//
//    val person = Person()
////    person.lastName
////    person.firstName
////    person.nickName = "Shades"
////    person.nickName = "New Nickname"
////    println(person.nickName)
//    person.printInfo()
//
//
//    val listA = mutableListOf(1, 2, 3)
//    val listB = listA.add(4)
//    print(listB)
//
//    val test = 33 to 42
//    println(test)
//
//    val a: String? = null
//    val b: String = "Hello World"
//    println(a==b)
//
//}