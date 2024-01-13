data class Department(val name: String, val employees: List<Employee>)
data class Employee(val name: String, val age: Int)

fun getAverageAge(departments: List<Department>): Double {
    var totalAge = 0
    var totalEmployees = 0
    for (department in departments) {
        for (employee in department.employees) {
            totalAge += employee.age
            totalEmployees++
        }
    }
    return totalAge.toDouble() / totalEmployees
}

fun main() {
    val departments = listOf(
        Department("Отдел продаж", listOf(
            Employee("Ivan", 24),
            Employee("Sofia", 27),
            Employee("Denis", 20),
            Employee("Sergey", 21),
            Employee("Artem", 37)
        ))
    )
    val averageAge = getAverageAge(departments)
    println("Средний возраст сотрудников всех департаментов: $averageAge лет")
}