fun main(){
    val employee1 = SomeEmployee("Kirill", 210000)
    val employee2 = SomeEmployee("Stepa", 230000)
    val employee3 = SomeEmployee("Sergey", 540000)
    val employee4 = SomeEmployee("Olga", 430000)

    val employees = listOf<SomeEmployee>(employee1, employee2, employee3, employee4)
    findEmployeeBySalary(employees, 210005)

    employee3?.callToClient("Ivan")
}

fun findEmployeeBySalary(employees: List<SomeEmployee>, salary: Int): SomeEmployee?{
    for (employee in employees){
        if (employee.salary == salary)
            println("У сотрудника ${employee.name} зарплата равна $salary")
    }
    return null
}