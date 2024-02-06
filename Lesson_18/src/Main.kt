import kotlin.math.PI

fun main(){
    val rectangle = Rectangle("blue", 0, 0, 5, 3)
    val round = Round("red", 0, 0, 5.4)
    rectangle.squareAndPerimeter()
    round.areaCircle()
    rectangle.moveRight(5)
    rectangle.moveDown(5)
}

open class Figure(val color: String, var x: Int = 0, var y: Int = 0){
    fun moveLeft(step: Int){
        x -= step
        println("Сдвигаем влево на $step. Новые координаты: x=$x, y=$y")
    }
    fun moveRight(step: Int){
        x += step
        println("Сдвигаем вправо на $step. Новые координаты: x=$x, y=$y")
    }
    fun moveDown(step: Int){
        y -= step
        println("Сдвигаем вниз на $step. Новые координаты: x=$x, y=$y")
    }
    fun moveUp(step: Int){
        y += step
        println("Сдвигаем вверх на $step. Новые координаты: x=$x, y=$y")
    }
}

class Rectangle(color: String, x: Int = 0, y: Int = 0, var width: Int, var height: Int) : Figure(color, x, y){
    fun squareAndPerimeter(){
        val square = width * height
        val perimeter = 2 * (width + height)
        println("Площадь прямоугольника равна: $square")
        println("Периметр прямоугольника равен: $perimeter")
    }

    fun equalsSides(){
        if (width == height){
            println("Это квадрат")
        }
    }
}

class Round(color: String, x: Int, y: Int, var radius: Double) : Figure(color, x, y){
    fun areaCircle(){
        println("Площадь окружности равен: ${PI * radius * radius}")

    }
    fun circumference(){
        println("Длина окружности равен: ${2 * PI * radius}")
    }
}

