fun main(){
    val users = listOf(
        User("Kirill", 45),
        User("Olga", 32),
        User("Marina", 12)
    )

    val result = elementsCount(users){it.age > 30}
    println(result)
}

fun elementsCount(users: List <User>, condition: (User) -> Boolean): Int{
    var counter = 0

    for(user in users){
        if(condition(user) == true){
            counter++
        }
    }
    return counter
}