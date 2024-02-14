fun employeeCity(employee: Employee): String{
    return employee.company?.address?.city?: "Неизвестно"
}

fun main(){
    val address1 = Address("Улица ???", "Чебоксары")
    val company1 = Company("Company1", address1)
    val employee1 = Employee("Sergey", company1)

    val city = employeeCity(employee1)
    println("Город: $city")
}
