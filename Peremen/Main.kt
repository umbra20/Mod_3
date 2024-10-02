package Module_3.Peremen

fun main() {
    val age: Int
    age = 37;
    val name: String
    name = "Юрий";
    val isStudent: Boolean
    isStudent = true;
    val salary: Double;
    salary = 30000.0;
    if (isStudent == true) {
        println("Возраст: " + age + " | " + "Имя: " + name + " | " + "Является студентом: " + isStudent + " | " + "Зарплата: " + salary);
    } else println("Не является студентом");
}