package documentation.functions//точка входа

//ФУНКЦИИ (функция принимает два аргумента Int и возвращает Int
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b

//функция которая не возвращает ни какого значения
fun printSum(a: Int, b: Int): Unit {
    println("Сумма $a и $b равна ${a + b}")
}

//Тип возвращаемого значения Unit может быть опущен.
fun printSum2(a: Int, b: Int) {
    println("Сумма $a и $b равна ${a + b}")

}

fun double(x: Int): Int {
    return 2 * x
}

//вызов функции
val summfunc = double(2)


//todo Параметры функции
//fun powerOf(number: Int, exponent: Int): Int { /*...*/ }
fun powerOf2(
    number: Int,
    exponent: Int, //завершающая запятая
) {/*...*/
}

//Аргументы по умолчания
//Параметры функции могут иметь значения по умолчанию,
// которые используются в случае, если аргумент функции не указан при её вызове.
// Это позволяет снизить уровень перегруженности кода.

fun read(
    b: ByteArray,
    off: Int = 0,
    len: Int = b.size,
) {/*...*/
}

//todo Переопределение методов
//При переопределении методов со значениями по умолчанию в сигнатуре эти параметры должны быть опущены.
open class A {
    open fun foo(i: Int = 10) {/*...*/
    }

    open class B : A() {
        override fun foo(i: Int) { /*...*/
        } // значение по умолчанию указать нельзя
    }
}


