package lesson2.`fun`


//функция получает один параметр
fun foo(param: Int) {
    println("Параметр: $param")
}

//вызов функций с двумя параметрами и передача 2 аргументов
fun printSum(int1: Int, int2: Int) {
    val result = int1 + int2
    println(result)
}

//получение значения из функции
fun max(a: Int, b: Int): Int {
    val maxValue = if (a > b) a else b
    return maxValue
}

//Функция без возвращаемого значения, Unit означает что функция не возвращает значение
fun printSum2(int1: Int, int2: Int) {
    val result = int1 + int2
    println(result)
}

fun printSumUnit(int1: Int, int2: Int): Unit {
    val result = int1 + int2
    println(result)
}


//Функция из единственного выражения, можно не писатьфигурные скобки ииспользовать для одной строчки в условии
fun max2(a: Int, b: Int) = if (a > b) a else b

fun main() {
    foo(3)
    printSum(2, 3)
    //передача переменных в функцию printSum()
    val x = 1
    val y = 3
    printSum(x, y)
    //возврат из функции max
    println(max(x, y))
    // println(printSumUnit(x,2)) //вернет kotlin.Unit
}