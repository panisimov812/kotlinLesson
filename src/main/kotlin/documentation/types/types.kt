package documentation.types

val one = 1 //Int
val threeBillion = 3000000000 // Long
val oneLong = 1L
val oneByte: Byte = 1

//Типы с плавающей точклй
val pi = 3.14 //Double
val oneDouble = 1.0

//Чтобы явно указать тип Float, добавьте после значения f или F.
// Если такое значение содержит более 6-7 разрядов, оно будет округлено.

val e = 2.7182818284 // Double
val eFloat = 2.7182818284f // Float, фактическое значение 2.7182817

fun main(){
    fun printDouble(d: Double){
        println(d)
    }

    val i = 1
    val d = 1.0
    val f = 1.0f

    printDouble(d)
}