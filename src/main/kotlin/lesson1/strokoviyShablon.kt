package lesson1
//что бы включить значение переменной в строку, поставьте перед именем переменной $
fun main() {
    var x = 42
    var value = "Value of x is $x"
    var myArray = arrayOf(1, 2, 3,)
    var firstItem = "The first item is ${myArray[0]}"
    var result = "myArray is ${if (myArray.size>10) "Large" else "small"}"
    println(result)
}