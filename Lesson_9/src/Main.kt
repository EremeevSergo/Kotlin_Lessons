class User(var name: String,var age: Int)

fun MinAgeUser(users: List <User>): Int{
    var minAge = 0
    for(user in users){
        if(minAge == 0 || user.age <= minAge)
            minAge = user.age
    }
    return minAge
}

fun main(){
    val users = listOf(
        User("Sergey", 20),
        User("Sofia", 18),
        User("Ivan", 36),
        User("Kirill", 15),
        User("Vika", 100)
    )

    var MinAge = MinAgeUser(users)
    println("Минимальный возвраст: $MinAge")
}