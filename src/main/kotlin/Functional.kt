fun main() {
    val list = listOf("Kotlin", "Java", "C++", "Javascript", null, null)
    list
        .filterNotNull()
        .filter { language ->
            language.startsWith("J")
        }
        .map { language ->
            language.length
        }
        .forEach {
            println(it)
        }

    list
        .filterNotNull()
        .take(3)
        .forEach {
            println(it)
        }

    list
        .filterNotNull()
        .associate { it to it.length }
        .forEach {
            println("${it.value}, ${it.key}")
        }

    val map = list.filterNotNull().associateWith { it.length }

    map.forEach {
        println("${it.value}, ${it.key}")
    }

    val firstLanguage = list.filterNotNull().first()
    println(firstLanguage)
    val lastLanguage = list.filterNotNull().last()
    println(lastLanguage)
    val findLanguage = list.filterNotNull().find { it.startsWith("Java") }
    println(findLanguage)
    val findLastLanguage = list.filterNotNull().findLast { it.startsWith("Java") }
    println(findLastLanguage)
    val notFindLanguage = list.filterNotNull().findLast { it.startsWith("foo") }.orEmpty()
    println(notFindLanguage)
}