package videoLesson.work.lesson2.exeptions

import org.testng.annotations.Test
import java.math.BigDecimal

class HomeWork {
    /*
    3)�������� �������,������� ��������� ���������� ������ ������ ���������� true,
     ���� ���� �� ���� ������ �������� ��������� �33333� ������ ����� 18 ��������.����������� ������� ��������� �
     ������ ���������.
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
    �������� �������, ������� ��������� ���������� ��������� ����� � ������ - �����
     � ���������� ���������� ����� � ���������, ������� ��������  � ���� ��� �����
     (����������). ����������� ������� ��������� � ������ ���������.
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
    �������� �������-���������� ��� ������ Int,
    ������� ���������� ���������� ���� � �����.
     */
    val num = mutableListOf(1, 2, 3, 4, 55, 677)


    fun MutableList<Int>.foo(list: MutableList<Int>) {
        val tmp = list.count()
        println(tmp)
    }

}
/*
�������� ����� � 3 ������.
���� � ���������� get � set
����, � ������� get ���������, ��� �������� ����
 �������������, ���� ��� - ������� ����(!) ����������
����, � ������� get �������� �������� �������� (String)
 � ������� ��������, � set �������� ������� �<� � �>� �� �lt� � �gt�
 */

class MyExceptions(message: String) : Exception(message) {

}

class testH(var integer: Int) {
    val id: Int = integer
//        get() {
//            try {
//                field <= 0
//            } catch (e: MyExceptions) {
//                throw MyExceptions("������ ����")
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






