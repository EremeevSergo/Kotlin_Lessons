fun main(){
    print("Введите width: ")
    var width: Int = readLine()!!.toInt()
    print("Введите heigth: ")
    var heigth: Int = readLine()!!.toInt()
    var rectangle = Rectangle(width, heigth)
    rectangle.squareAndperimeter()
    rectangle.equalsSides()
}

class Rectangle(private var width: Int,private var heigth: Int){
    fun squareAndperimeter(){
        var square = width * heigth
        var perimetr = 2 * (width + heigth)
        println("Площадь прямоугольника равна: ${square}")
        println("Периметр прямоугольника равен: ${perimetr}")
    }

    fun equalsSides(){
        if(width == heigth){
            println("Это квадрат")
        }
    }

}