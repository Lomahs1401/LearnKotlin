enum class Direction {
    NORTH, SOUTH, EAST, WEST;

    fun getOppositeDirection(): Direction {
        return when (this) {
            NORTH -> SOUTH
            SOUTH -> NORTH
            EAST -> WEST
            WEST -> EAST
        }
    }
}

fun main() {
    val direction = Direction.NORTH
    val oppositeDirection = direction.getOppositeDirection()
    println("Opposite direction of $direction is $oppositeDirection")
}