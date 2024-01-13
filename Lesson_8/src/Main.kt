fun main(){
    val UsersGroup = listOf(
        User("Ivan", 35 ),
        User("Sofia", 18),
        User("Kirill", 24),
        User("Sergey", 20)
    )
    val averageAge = AverageAge(UsersGroup)
    println("Средний возраст: $averageAge")
}

fun AverageAge(users: List <User>): Double{
    var totalAge = 0
    for(user in users){
        totalAge += user.age
    }
    return totalAge.toDouble()/users.size
}

data class User(val name: String, val age: Int)