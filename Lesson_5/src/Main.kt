//В программе каршеринга в зависимости от возраста и стажа водителя доступны разные авто. Озвучены следующие требования.
//Общие требования:
//Возраст не меньше 21 года.
//Водительский стаж категории «В» от двух лет.
//Дополнительные требования для доступа к автомобилям Audi, BMW:
//Возраст не меньше 26 лет.
//Водительский стаж категории «В» от шести лет.
//Написать функцию, которой на вход приходят возраст и стаж водителя. Функция должна вернуть сообщение о том может ли он пользоваться каршерингом и какие авто ему доступны

fun main() {
    print("Введите ваш возраст: ")
    var age: Int = readLine()!!.toInt()
    print("Введите ваш водительский стаж: ")
    var experience: Int = readLine()!!.toInt()
    var messageCarSharing: String = carSharing(age, experience)
    println(messageCarSharing)
}

fun carSharing(a: Int, b: Int): String { // добавлен тип возвращаемого значения
    var message: String = if (a >= 21 && b >= 2) {
        if (a >= 26 && b >= 6)
            "Вы можете использовать каршеринг и вам доступны все машины в том числе и Audi и BMW"
        else
            "Вам доступен каршеринг, но недоступны BMW и Audi"
    } else {
        "Вам недоступен каршеринг"
    }
    return message // добавлен оператор return для возврата значения
}