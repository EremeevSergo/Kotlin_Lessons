fun main(){
    val employee1 = SomeEmployee("Kirill", 210000)
    val employee2 = SomeEmployee("Stepa", 230000)
    val employee3 = SomeEmployee("Sergey", 540000)
    val employee4 = SomeEmployee("Olga", 430000)

    val employees = listOf<SomeEmployee>(employee1, employee2, employee3, employee4)
    try {
        val foundEmployee = findEmployeeBySalary(employees, 210005)
        println("У сотрудника ${foundEmployee.name} указанная зарплата")
    }
    catch (e: NoSuchElementException){
        println("Сотрудник с такой зарплатой не найден")
    }
    employee3.callToClient("Ivan")
}

fun findEmployeeBySalary(employees: List<SomeEmployee>, salary: Int): SomeEmployee{
    for (employee in employees){
        if (employee.salary == salary)
            return employee
    }
    throw NoSuchElementException("Сотрудник с зарплатой $salary не найден")
}