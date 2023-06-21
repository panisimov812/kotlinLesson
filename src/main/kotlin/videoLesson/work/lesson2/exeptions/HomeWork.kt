package videoLesson.work.lesson2.exeptions

import org.testng.annotations.Test
import java.math.BigDecimal

class HomeWork {
    /*
    3)Напишите функцию,которая принимает аргументом список строки возвращает true,
     если хотя бы одна строка содержит подстроку «33333» иимеет длину 18 символов.Используйте функции коллекций и
     лямбда выражения.
     */

    val list1 = mutableListOf("33333", "211111111111111113", "234234")
    val list2 = mutableListOf("12", "23", "234234", "234234")

    fun checkString(list: MutableList<String>) {
        list.any { it.contains("33333") }
    }

    @Test
    fun checkStringTest(list: MutableList<String>) {
        checkString(list)
    }


    /*
    Напишите функцию, которая принимает аргументом коллекцию строк и строку - маску
     а возвращает количество строк в коллекции, которые содержат  в себе эту маску
     (подстрокой). Используйте функции коллекций и лямбда выражения.
     */

    fun getCollections(list: MutableList<String>, string: String) {
        val listValue = list.filter { it.contains(string) }.count()
        println(listValue)
    }

    @Test
    fun getCollectionsTest() {
        val list2 = mutableListOf("12", "23", "234234", "234234")
        getCollections(list2, "234234")
    }

    /*
    Напишите функцию-расширение для класса Int,
    которая возвращает количество цифр в числе.
     */
    val num = mutableListOf(1, 2, 3, 4, 55, 677)


    fun MutableList<Int>.foo(list: MutableList<Int>) {
        val tmp = list.count()
        println(tmp)
    }

}
/*
Напишите класс с 3 полями.
Поле с дефолтными get и set
Поле, в котором get проверяет, что значение поля
 положительное, если нет - бросает ваше(!) исключение
Поле, в котором get приводит входящее значение (String)
 к нижнему регистру, а set заменяет символы ‘<’ и ‘>’ на ‘lt’ и ‘gt’
 */

class MyExceptions(message: String) : Exception(message) {

}

class testH(var integer: Int) {
    val id: Int = integer
//        get() {
//            try {
//                field <= 0
//            } catch (e: MyExceptions) {
//                throw MyExceptions("Меньше нуля")
//            }
//        }
    val id_1: Int = integer
    val id_2: Int = integer

}

class Payment(var paymentType: String) {
    val id: String = paymentType.plus(6)


    var sum: BigDecimal = BigDecimal(0.0)
        get() = field.abs()
        set(value) {
            field = value.setScale(2, BigDecimal.ROUND_HALF_UP)
        }


    @Test
    fun getTest() {
        val payment = Payment("ac")
        payment.sum = BigDecimal(-10.233333)
        println(payment.sum)
    }
}






