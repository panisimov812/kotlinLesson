package documentation.functions
//todo ѕри вызове функции вы можете €вно указать имена одного или нескольких аргументов.
// Ёто может быть полезно, когда у функции большой список аргументов, и сложно св€зать значение с аргументом,
// особенно если это логическое или null значение.
//
//ѕри €вном указывании имен аргументов в вызове функции, вы можете свободно
// измен€ть пор€док их перечислени€, и, если вы хотите использовать их значени€ по
// умолчанию, вы можете просто пропустить эти аргументы.

fun reformat(
    str: String,
    normilizeCase: Boolean = true,
    upperCaseFirstLetter: Boolean = true,
    divideByCamelHumps: Boolean = false,
    wordSeparation: Char = ' ',
) {/*...*/}

fun main() {
    reformat(
        "String!",
        upperCaseFirstLetter = false,
        divideByCamelHumps = true,
    )
    reformat("This is a long String")
}