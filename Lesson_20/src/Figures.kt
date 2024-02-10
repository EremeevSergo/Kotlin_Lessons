import org.intellij.lang.annotations.PrintFormat
import kotlin.math.PI
import kotlin.math.sqrt

abstract class Figure(val color: String): Movable{
    var x: Int = 0
    var y: Int = 0

    override fun moveLeft(step: Int){
        x += step
        println(" Переместился влево на $step, новая координата: x = $x, y = $y")
    }
    override fun moveRight(step: Int){
        x += step
        println("Переместился вправо на $step, новая координата: x = $x, y = $y")
    }
    override fun moveDown(step: Int){
        y += step
        println("Переместился вверх на $step, новая координата: x = $x, y = $y")
    }
    override fun moveUp(step: Int){
        y -= step
        println("Переместился вниз на $step, новая координата: x = $x, y = $y")
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