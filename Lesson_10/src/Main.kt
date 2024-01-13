class User( var name: String,var age: Int,var experience: Int)
class Car(var brend: String,var arendPrice: Int)

fun ArendCarMessage(user: User, cars: List<Car>): List <Car>{
    var message: String ?= null
    val aviablesCar = mutableListOf<Car>()
    for(car in cars){
        if(user.age >= 21 && user.experience >= 2){
            if(user.age >= 26 && user.experience >= 6 && (car.brend == "Audi" || car.brend == "BMW")){
                aviablesCar.add(car)
            }
            else if(car.brend != "Audi" || car.brend != "BMW"){
                aviablesCar.add(car)
            }
        }
    }
    return aviablesCar
}

fun main(){
    var cars = listOf(
        Car("Audi", 4500),
        Car("BMW", 5000),
        Car("Lada", 1600),
        Car("Kia", 2900),
        Car("Nissan", 3600)
    )
    var user = User("Ivan", 29, 7)

    var message = ArendCarMessage(user, cars)
    println("Пользователю ${user.name} доступны машины: ")
    for (car in message){
        println(car.brend)
    }
}