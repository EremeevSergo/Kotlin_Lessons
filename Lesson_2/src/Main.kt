//Написать функцию, которая для двух целых чисел возвращает «первое число больше» если первое больше, «второе число больше» если второе больше и «числа равны», если они равны
fun main(){
    print("Введите первое число: ")
    var a: Int = readLine()!!.toInt()
    print("Введите второе число: ")
    var b: Int = readLine()!!.toInt()
    var message: String = getMaxMessage(a, b)
    println(message)
}

fun getMaxMessage(a: Int, b: Int): String{
    var resultMessage: String = if(a > b)
        "Первое число больше"
    else if(a == b)
        "Числа равны"
    else
        "Второе число больше"

    return resultMessage
}