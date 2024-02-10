import kotlin.math.PI
import kotlin.math.sqrt

fun main(){
    val rectangle = Rectangle("red", 5.2, 3.4)
    val trisngle = Trisngle("green", 6.2, 4.3, 3.1,)

    val animal1 = Animal("Tiger")
    val animal2 = Animal("Cat")

    val movablesObject = listOf<Movable>(rectangle, trisngle, animal1, animal2)
    for (item in movablesObject){
        item.moveLeft(4)
    }

}

interface Movable {
    fun moveLeft(step: Int)
    fun moveRight(step: Int)
    fun moveDown(step: Int)
    fun moveUp(step: Int)
}


