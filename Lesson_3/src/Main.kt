//Написать функцию, которая возвращает текстовое представление для целых чисел от 1 до 5 (1 – «один», 2 – «два», 3 – «три», 4 – «четыре», 5 – «пять»)
fun main(){
    println("Введите число от 1 до 5: ")
    var a: Int = readLine()!!.toInt()
    var message: String = messageNumber(a)
    println(message)
}
fun messageNumber(a: Int): String{
    var NumberMessage: String = when(a){
        1 -> "Один"
        2 -> "Два"
        3 -> "Три"
        4 -> "Четыре"
        5 -> "Пять"
        else -> "Ошибка: Условие не выполнено"
    }
    return NumberMessage
}