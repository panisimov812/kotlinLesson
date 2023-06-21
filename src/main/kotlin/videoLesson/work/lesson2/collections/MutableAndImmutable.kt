package videoLesson.work.lesson2.collections

import org.testng.annotations.Test

class MutableAndImmutable {

//list - ����� ��������� �������
//set - ������� �� ��������
//map - ���� ��������

    /*
    ��������� �������� �� ���������� � �� ���������� (mutable � immutable)

    mutable                 immutable
    MutableList<T>          List<T>

     */

    @Test
    fun mutableTest(){
        val list = mutableListOf(1,2,3)
        list.add(4)
        list.remove(0)
        list.set(1,10)

        println(list)
    }

    @Test
    fun imutableTest(){
        val list = listOf(1,2,3)
    }
}





