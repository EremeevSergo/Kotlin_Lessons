//Напишите функцию, которая возвращает большее из двух целых чисел.
    fun main() {
        print("Введите первое число: ")
        var a: Int = readLine()!!.toInt()
        print("Введите второе число: ")
        var b: Int = readLine()!!.toInt()

        var result: Int = maxGetNumber(a, b)
        println("Наибольшее число $result")
    }

    fun maxGetNumber(a: Int, b: Int): Int{
        var result = if(a > b)
            a
        else
            b
        return result
    }
