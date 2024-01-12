fun main(){
    //Данные о машине(Бренд и цена аренды)
    var car1 = Car("Audi", 2500)
    var car2 = Car("BMW", 4500)
    var car3 = Car("KIA", 1000)
    var car4 = Car("Lada", 700)

    //Ввод данных о пользователе(Имя, возраст, водительский стаж)
    print("Введите ваше имя: ")
    var nameUs: String = readLine().toString()
    print("Введите ваш возраст: ")
    var ageUs: Int = readLine()!!.toInt()
    print("Введите ваш водительский стаж: ")
    var experienceUs: Int = readLine()!!.toInt()

    var user1 = User(nameUs, ageUs, experienceUs)

    var carSharingMessage = CarSharingMessage(user1, car1, car2, car3, car4)

    println(carSharingMessage)

}

fun CarSharingMessage(user1: User, car1: Car, car2: Car, car3: Car, car4: Car): String{
    var message: String = if(user1.age >= 21 && user1.experience >= 2){
        if(user1.age >= 26 && user1.experience >= 6){
            "Пользователю ${user1.name} доступны бренды машин: ${car1.brend} по цене аренды ${car1.priceArend}, ${car2.brend} по цене аренды ${car2.priceArend}, ${car3.brend} по цене аренды ${car3.priceArend}, ${car4.brend} по цене аренды ${car4.priceArend}"
        }
        else{
            "Пользователю ${user1.name} доступны бренды машин: ${car3.brend} по цене аренды ${car3.priceArend}, ${car4.brend} по цене аренды ${car4.priceArend}"
        }
    }
    else{
        "Пользователю ${user1.name} недоступна аренда машин"
    }
    return message
}

data class Car(val brend: String, val priceArend: Int)
data class User(val name: String, val age: Int, val experience: Int)