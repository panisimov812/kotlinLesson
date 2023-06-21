package videoLesson.work.lesson2.collections

import org.testng.annotations.Test

class MutableAndImmutable {

//list - может содержать повторы
//set - повторы не содержит
//map - ключ значение

    /*
    коллекции деляться на изменяемые и не изменяемые (mutable и immutable)

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





