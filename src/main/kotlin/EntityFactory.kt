import java.util.UUID

enum class EntityType {
    HELP, EASY, MEDIUM, HARD;

    fun getFormattedName() = name.toLowerCase().capitalize();
}

object EntityFactory {
    fun create(type: EntityType) : Entity {
        val id = UUID.randomUUID().toString()
        val name = when (type) {
            EntityType.EASY -> type.name
            EntityType.MEDIUM -> type.getFormattedName()
            EntityType.HARD -> "Hard"
            EntityType.HELP -> type.getFormattedName()
        }
        return when (type) {
            EntityType.EASY -> Entity.Easy(id, name)
            EntityType.MEDIUM -> Entity.Medium(id, name)
            EntityType.HARD -> Entity.Hard(id, name, 2f)
            EntityType.HELP -> Entity.Help
        }
    }
}

sealed class Entity() {
    object Help : Entity() {
        var name = "Help"
    }
    data class Easy(val id: String, val name: String) : Entity() {
        override fun equals(other: Any?): Boolean {
             return super.equals(other);
        }

        override fun hashCode(): Int {
            return super.hashCode()
        }
    }
    data class Medium(val id: String, val name: String) : Entity()
    data class Hard(val id: String, val name: String, val multipler: Float) : Entity()
}

fun Entity.Medium.printInfo() {
    println("Medium class: $id")
}

val Entity.Medium.info: String
    get() = "Some Info"

fun main() {
    val easyEntity = EntityFactory.create(EntityType.EASY)
    println(easyEntity)

    val mediumEntity = EntityFactory.create(EntityType.MEDIUM)
    if (mediumEntity is Entity.Medium) {
        mediumEntity.printInfo()
        println(mediumEntity.info);
    }

    var entity: Entity = EntityFactory.create(EntityType.EASY)
    var msg = when (entity) {
        Entity.Help -> "Help Class"
        is Entity.Easy -> "Easy Class"
        is Entity.Medium -> "Medium Class"
        is Entity.Hard -> "Hard Class"
        else -> {}
    }

    println(msg)

    val entity1 = EntityFactory.create(EntityType.EASY)
    val entity2 = EntityFactory.create(EntityType.EASY)

    if (entity1 == entity2) {
        println("Equal")
    } else {
        println("Not Equal")
    }

    val entity3 = Entity.Easy("id", "name")
//    val entity4 = Entity.Easy("id", "name")
    val entity4 = entity3.copy()

    if (entity3 == entity4) {
        println("Equal")
    } else {
        println("Not Equal")
    }
}