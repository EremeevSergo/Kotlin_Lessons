data class Company(val name: String, val departments: List<Department>)
data class Department(val name: String, val employees: List<Employee>)
data class Employee(val name: String, val age: Int)

fun totalNumberOfEmployees(company: Company): Int{
    var counter = 0
    for(departament in company.departments){
        counter += departament.employees.size
    }
    return counter
}

fun averageAgeOfEmployees(company: Company): Int{
    var sumAge = 0
    var count = 0
    for(departament in company.departments){
        count += departament.employees.size
        for (employ in departament.employees){
            sumAge += employ.age
        }
    }
    return sumAge / count
}

fun main(){
    val employee1 = Employee("Kirill", 23)
    val employee2 = Employee("Olga", 28)
    val employee3 = Employee("Ivan", 25)
    val employee4 = Employee("Oleg", 35)
    val employee5 = Employee("Roman", 32)
    val employee6 = Employee("Nikolay", 40)
    val employee7 = Employee("Marina", 57)

    val department1 = Department("IT", listOf(employee1, employee2, employee3))
    val department2 = Department("HR", listOf(employee4))
    val department3 = Department("Finance", listOf(employee5, employee6, employee7))

    val company = Company("NoName", listOf(department1, department2, department3))

    val CountEmploy = totalNumberOfEmployees(company)
    val SredAge = averageAgeOfEmployees(company)

    println("Общее количество сотрудников компании ${company.name} - $CountEmploy")
    println("Средний возраст сотрудников - $SredAge")
}

