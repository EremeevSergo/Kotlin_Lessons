class SomeEmployee(
    val name: String,
    val salary: Int
) {
    fun callToClient(clientName: String) {
        println("Сотрудник ${name}: звоню клиенту $clientName")
    }
}