fun main(){
    val users = listOf(
        User("Kirill", 45),
        User("Olga", 32),
        User("Marina", 12)
    )

    val result = convertToStrings(users){"Name: ${it.name}. Age: ${it.age}"}
    println(result)
}


fun convertToStrings(users: List<User>, conversion: (User) -> String): List<String>{
    val result = mutableListOf<String>()

    for(user in users) {
        var string = conversion(user)
        result.add(string)
    }
    return result
}