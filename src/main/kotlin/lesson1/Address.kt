package lesson1

class Address {
    var name: String = "Petr"
    var street: String = "Лесной"
    var city: String = "Питер"
    var state: String? = null
    var zip: String = "1234"

    //обращение к свойству
fun copyAddress(address: Address): Address{
        val result = Address() //в котлин нет слова new
        result.name = address.name //вызов метода доступа
        return result
}


}