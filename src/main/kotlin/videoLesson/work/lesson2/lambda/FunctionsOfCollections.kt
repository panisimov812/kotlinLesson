package videoLesson.work.lesson2.lambda

import org.testng.annotations.Test

/*
map - преобразует каждый элемент коллекции, возвращает новую коллекцию
actions.map(it.actions.text)
 */
class FunctionsOfCollections {

    @Test
    fun mapTest() {
        val list = mutableListOf("Бояться", "горя", "счастья", "не", "знать")
        val newList = list.map { it.plus("+") } //добавили ко всем элементам плюсики
        val newList2 = list.filter { it.contains('о') } //вернет значениея с этой буквой
        val newList3 = list.any { it.contains('о') }  //вернет true если хотябы один элемент вернет подходит под условие
        val newList4 = list.all { it.contains('о') } //вернет все элементы если все элементы соответсствуют условию
        val newList5 = list.filter { it.contains('о') }.count() //посчитает количество элементов с О
        println(newList5)

    }

    //конструктор массива
    val myArray = Array(5) { i -> i * 2 }

    //смена мест элементов (без функции расширения)
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

    //расширение функции
    //вызвали на нашем списке фуркцию и прописали ее
    fun MutableList<Int>.swap2(index1: Int, index2: Int) {
        val tmp = this[index1]
        this[index1] = this[index2]
        this[index2] = tmp
    }
}