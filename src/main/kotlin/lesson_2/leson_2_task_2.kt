package lesson_2

fun main() {
    val workers: Int = 50
    val employeeSalaries: Int = 30000
    val interns: Int = 30
    val salaryOfInterns: Int = 20000
    val totalEmployees: Int = 80

    val salaryExpensesForPermanentEmployees: Int = workers * employeeSalaries
    val expensesForInterns: Int = interns * salaryOfInterns
    val generalExpenses: Int = salaryExpensesForPermanentEmployees + expensesForInterns
    val averageSalary: Int = generalExpenses / totalEmployees


         println(salaryExpensesForPermanentEmployees)
         println(expensesForInterns)
         println(generalExpenses)
         println(averageSalary)


}