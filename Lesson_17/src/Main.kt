import kotlin.math.PI
class Round(private var radius: Double){
    fun areaСircle(): Double{
        return PI * radius * radius
    }
    fun areaPerimetr(): Double{
        return 2 * PI * radius
    }
}

fun main(){
    print("Введите радиус круга: ")
    var radius = readLine()!!.toDouble()
    var round = Round(radius)
    println("Выберите вычисление которое вы хотите произвести: 1. Площадь круга; 2. Длина окружности")
    var a: Int = readLine()!!.toInt()
    when(a) {
        1 -> {
            var areaCircle = round.areaСircle()
            println("Площадь круга равна ${areaCircle}")
        }

        2 -> {
            var perimetrCircle = round.areaPerimetr()
            println("Длина окружности равна ${perimetrCircle}")
        }

        else -> {
            println("Введен некорректный номер")
        }
    }
}