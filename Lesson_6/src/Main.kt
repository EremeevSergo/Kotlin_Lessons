//Те же требования каршеринга. Написать функцию, принимающую на вход марку авто(String), возраст и стаж пользователя и возвращающую Boolean (доступно ему это авто или нет)
fun main(){
    print("Введите ваш возраст: ")
    var age: Int = readLine()!!.toInt()
    print("Введите ваш стаж: ")
    var experience: Int = readLine()!!.toInt()
    print("Введите марку машины: ")
    var carMake: String = readLine()!!.toString()

    var message: Boolean = carSharing(age, experience, carMake)
    println(message)
}

fun carSharing(a: Int, b: Int, c: String): Boolean{
    var bool: Boolean = if(a >= 21 && b >= 2 && (c == "Audi" || c == "BMW")){
        if(a >= 26 && b >= 6){
            true
        }
        else {
            false
        }
    }
    else if(a >= 21 && b >= 2 && (c != "Audi" || c != "BMW")){
        true
    }
    else{
        false
    }
    return bool
}