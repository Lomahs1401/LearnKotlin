open class Outer {
    private val a = 1
    protected open val b = 2
    internal open val c = 3
    val d = 4

    protected class Nested {
        public val e: Int = 5
    }
}

class Subclass : Outer() {
    override val b: Int
        get() = 10

    override val c: Int
        get() = super.c
}


