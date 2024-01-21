fun main(){
    val users = listOf(
        User("Kirill", 45),
        User("Olga", 32),
        User("Marina", 12)
    )
    val result = containsElement(users){it.name.length > 10}
    println(result)
}


fun containsElement(users: List<User>, condition: (User) -> Boolean): Boolean{
    var result = false

    for(user in users)
        if(condition(user)) {
            result = true
            break
        }

    return result
}