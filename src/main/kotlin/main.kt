fun main() {
    //Задача 1
    val amount = 15_000
    val commission = 0.0075

    val totalCommission = amount * commission
    val result = if (totalCommission > 35) totalCommission else 35

    println("Размер комиссии $result руб.")
    println()

    //Задача 2
    val likes = 161
    val people: String = if (likes % 10 == 1 && likes != 11) "человеку" else "людям"

    println("Понравилось $likes $people")
    println()

    //Задача 3
    val isRegular: Boolean = false
    val cost = 13_000
    val discount100 = 100
    val discount5Per = 0.95

    val resultCost: Double
    if (1000 < cost && cost < 10001) {
        resultCost = (cost - discount100).toDouble()
    } else if (cost > 10000) {
        resultCost = cost * discount5Per
    } else resultCost = cost.toDouble()

    val finalCost: Double
    if (isRegular) {
        finalCost = resultCost * 0.99
    } else finalCost = resultCost

    println("Стоимость покупки $finalCost руб.")
}