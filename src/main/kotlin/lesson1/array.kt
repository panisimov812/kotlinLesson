fun main() {
    var myArray = arrayOf(1, 2, 3, 4)
    println(myArray[0])
    println(myArray.size)

    //обновление массива myArray
    myArray[1] = 15
    println(myArray[1])
    //явное определение массива (с переменной тоже самое, поставить ":" после имени а затем узать ее тип
    //var myArray: Array<Byte> = arrayOf(1, 2, 3)

    myArray = arrayOf(4, 5)

    val index = arrayOf(1, 2, 3, 4)
    val fruit = arrayOf("Apple", "Banana", "Cheerry", "Blueberry", "Pomegrante")
    var x = 0
    var y: Int
    while (x < 4) {
        y = index[x]
        println("Fruit = ${fruit[y]}")
        x = x + 1

    }

}