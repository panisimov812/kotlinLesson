package videoLesson.work.lesson2.exeptions

import org.testng.annotations.Test


class Main {

    @Test
    fun exceptionTest() {
        val list = mutableListOf(1, 2, 3, 4, 5, 6)
     //   list.get(7)
    }

    @Test
    fun myExceptionTest() {
        val listCard = mutableListOf("13324234234234", "234234234234")
        try {
            listCard.get(3)
        } catch (e: IndexOutOfBoundsException) {
            throw CardNotFoundException("Карты нет")
        }
    }

    @Test
    fun npeTest() {
        val sum: String? = "13.13"
        if (sum != null) {
            sum.length
        }
    }

    @Test
    fun npeTestNull() {
        val sum: String? = null
        val lenSum: Int?

        lenSum = sum?.length
        println(lenSum)
    }

    @Test
    fun npeTestTernary() {
        val sum: String? = null
        val lenSum: Int?

        lenSum = sum?.length ?: 0
        println(lenSum)
    }

}