import kotlin.math.PI
import kotlin.math.sqrt

fun main(){
    val rectangle = Rectangle("red", 5.2, 3.4)
    rectangle.moveUp(3)
    rectangle.moveLeft(2)
    val area = rectangle.area()
    println("Площадь равна: ${area}")
    
}

abstract class Figure(val color: String){
    var x: Int = 0
    var y: Int = 0

    fun moveLeft(step: Int){
        x += step
    }
    fun moveRight(step: Int){
        x += step
    }
    fun moveDown(step: Int){
        y += step
    }
    fun moveUp(step: Int){
        y -= step
    }
    abstract fun area(): Double
    abstract fun length(): Double
}

class Rectangle(color: String, val wigth: Double, val heigth: Double): Figure(color){
    override fun area(): Double{
        return wigth * heigth
    }
    override fun length(): Double{
        return 2 * (wigth * heigth)
    }
}
class Round(color: String, val radius: Double): Figure(color){
    override fun area(): Double{
        return PI * radius * radius
    }
    override fun length(): Double{
        return 2 * PI * radius
    }

}
class Trisngle(color: String, val a: Double, val b: Double, val c: Double): Figure(color) {
    override fun area(): Double {
        val p = (a + b + c) / 2
        return sqrt(p * (p - a) * (p - b) * (p - c))
    }

    override fun length(): Double {
        return a + b + c
    }
}