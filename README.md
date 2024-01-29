Homework for the course Kotlin

1. Написать функцию, которая возвращает большее из двух целых чисел.

2. Написать функцию, которая для двух целых чисел возвращает «первое число больше» если первое больше, «второе число больше» если второе больше и «числа равны», если они равны

3. Написать функцию, которая возвращает текстовое представление для целых чисел от 1 до 5 (1 – «один», 2 – «два», 3 – «три», 4 – «четыре», 5 – «пять»)

4. Написать функцию, которая проверяет email на корректность. Корректным считается email если в нем присутствует символа @ и точка. Проверить наличие символа в строке можно с помощью функции contains следующим образом: string.contains(‘@’), где string – любая переменная типа String. Обратите внимание, что отдельные символы пишутся в одинарных кавычках, тогда как строка пишется в двойных.
На вход email: String, на выходе Boolean
Например:
Если есть val text: String = “Forest”, тогда text.contains(‘e’) выдаст true, а !text.contains(‘e’) выдаст false

5. В программе каршеринга в зависимости от возраста и стажа водителя доступны разные авто. Озвучены следующие требования.
Общие требования:
· Возраст не меньше 21 года.
· Водительский стаж категории «В» от двух лет.
Дополнительные требования для доступа к автомобилям Audi, BMW:
· Возраст не меньше 26 лет.
· Водительский стаж категории «В» от шести лет.
Написать функцию, которой на вход приходят возраст и стаж водителя. Функция должна вернуть сообщение о том может ли он пользоваться каршерингом и какие авто ему доступны

6. Те же требования каршеринга. Написать функцию, принимающую на вход марку авто(String), возраст и стаж пользователя и возвращающую Boolean (доступно ему это авто или нет)

----------data class---------------

7. Опишите дата классы для хранения информации из задания 5 по функциям.
Для пользователя (User) должно храниться имя, возраст, стаж. Для автомобиля (Car): бренд, цена аренды
Переделайте функции из задач 5 и 6 из раздела "функции" на работу с этими дата-классами.
Т.е. функции должны принимать не возраст, стаж и бренд авто, а объекты классов User и Car
(функции пишите в этом файле заново)
Поля «имя» в классе User и «цена аренды» в классе Car никак не будут использоваться в тех функциях, которые вы напишите.
Это нормально. Не обязательно вся информация всегда нужна.
Проверьте работу написанных функций на примере каких-нибудь входных данных.

----------Collections------------

8. Написать функцию, которая принимает на вход список объектов класса User и возвращает средний возраст всех пользователей.

9. Написать функцию, которая принимает на вход список объектов класса User и возвращает самого младшего из них

10. Для классов User и Car из задач по дата-классам написать функцию, которая принимает на вход список автомобилей и пользователя и выдает список только тех автомобилей из исходного списка, которые доступны данному пользователю.

11. Даны классы
Отдел: data class Department(val name: String, val employees: List<Employee>)
Сотрудник: data class Employee(val name: String, val age: Int)
Написать функцию, которая на вход принимает объект класса Department и возвращает средний возраст сотрудников этого отдела

12. Дана такая структура классов:
Компания: data class Company(val name: String, val departments: List<Department>)
Отдел: data class Department(val name: String, val employees: List<Employee>)
Сотрудник: data class Employee(val name: String, val age: Int)
Написать функции для подсчета общего количества человек, работающих в заданной компании и их среднего возраста
fun totalNumberOfEmployees(company: Company): Int
fun averageAgeOfEmployees(company: Company): Int

--------------------------Лямбда-выражения------------------------------

Напишите функции, которые должны принимать на вход список пользователей и лямбда выражение:

13. Функцию преобразования каждого элемента в String в соответствии с заданным лямбда-выражением
fun convertToStrings(users: List<User>, conversion: (User) -> String): List<String>

14. Функцию, которая отвечает на вопрос присутствует ли в коллекции элемент, который удовлетворяет условиям
fun containsElement(users: List<User>, condition: (User) -> Boolean): Boolean

15. Функцию, которая возвращает количество элементов, удовлетворяющих условию:
fun elementsCount(users: List<User>, condition: (User) -> Boolean): Int


------------------------Введение в ООП-----------------------------------

16.  Напишите класс прямоугольника (Rectangle) с полями width и height (ширина и высота), инициализирующимися через конструктор.
Добавьте в него функции, которые будут считать площадь (width*height) и периметр прямоугольника (2*(width+height))
Добавьте функцию, которая будет отвечать на вопрос является ли этот прямоугольник квадратом (равны ли его стороны)
Создайте объект класса Rectangle и проверьте работоспособность написанных функций
