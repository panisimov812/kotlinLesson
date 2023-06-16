package documentation.types

//Операторы is и !is
//Используйте оператор is или его отрицание !is, чтобы проверить соответствует ли объект заданному типу во время исполнения.

/*
if (obj is String) {
    print(obj.length)
}

if (obj !is String) { // то же самое, что и !(obj is String)
    print("Not a String")
}
else {
    print(obj.length)
}
 */

fun demo(x: Any){
    if (x is String) {
        println(x.length) // x автоматически преобразовывается в String
    }
}


fun main() {
    demo("dfs")
}