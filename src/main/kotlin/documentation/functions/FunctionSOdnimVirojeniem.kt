package documentation.functions
//Когда функция возвращает одно единственное выражение, фигурные скобки { } могут быть опущены,
// и тело функции может быть описано после знака =.


//fun double(x: Int): Int = x * 2

//Нефексированное число аргументов varargs

fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) //ts - это массив (Array)
        result.add(t)
    return result
}

//указания нескольких значений в качестве аоргуметов
val list = asList(1, 2, 3)