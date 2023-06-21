package videoLesson.work.lesson2.lambda

import org.testng.annotations.Test

/*
map - ����������� ������ ������� ���������, ���������� ����� ���������
actions.map(it.actions.text)
 */
class FunctionsOfCollections {

    @Test
    fun mapTest() {
        val list = mutableListOf("�������", "����", "�������", "��", "�����")
        val newList = list.map { it.plus("+") } //�������� �� ���� ��������� �������
        val newList2 = list.filter { it.contains('�') } //������ ��������� � ���� ������
        val newList3 = list.any { it.contains('�') }  //������ true ���� ������ ���� ������� ������ �������� ��� �������
        val newList4 = list.all { it.contains('�') } //������ ��� �������� ���� ��� �������� �������������� �������
        val newList5 = list.filter { it.contains('�') }.count() //��������� ���������� ��������� � �
        println(newList5)

    }

    //����������� �������
    val myArray = Array(5) { i -> i * 2 }

    //����� ���� ��������� (��� ������� ����������)
    @Test
    fun swapTest() {
        val list = mutableListOf(1, 2, 3, 4)
        swap(list, 0, 1)
        println(list)
    }

    fun swap(list: MutableList<Int>, index1: Int, index2: Int) {
        val tmp = list[index1]
        list[index1] = list[index2]
        list[index2] = tmp
    }

    //���������� �������
    //������� �� ����� ������ ������� � ��������� ��
    fun MutableList<Int>.swap2(index1: Int, index2: Int) {
        val tmp = this[index1]
        this[index1] = this[index2]
        this[index2] = tmp
    }
}