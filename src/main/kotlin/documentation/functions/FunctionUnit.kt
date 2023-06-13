package documentation.functions

//≈сли функци€ не возвращает никакого полезного значени€, еЄ возвращаемый тип - Unit.
// Unit - тип только с одним значением - Unit. Ёто значение не нуждаетс€ в €вном указании возвращени€ функции.

fun printHello(name: String?): Unit {
    if (name != null)
        println("Hello $name")
    else
        println("Hi there!")
}
//”казание типа Unit в качестве возвращаемого значени€ тоже не €вл€етс€ об€зательным
//  од, написанный выше, и следующий код совершенно идентичны:
 //fun printHello(name: String?) { /*...*/ }



