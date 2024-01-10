//Написать функцию, которая проверяет email на корректность. Корректным считается email если в нем присутствует символа @ и точка. Проверить наличие символа в строке можно с помощью функции contains следующим образом: string.contains(‘@’), где string – любая переменная типа String. Обратите внимание, что отдельные символы пишутся в одинарных кавычках, тогда как строка пишется в двойных.
//На вход email: String, на выходе Boolean
fun main() {
    print("Введите ваш Email: ")
    var email: String = readLine()!!.toString()
    println(checkEmail(email))
}
fun checkEmail(a: String): Boolean {
    return a.contains('@') && a.contains('.')
}