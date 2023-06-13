package documentation.functions

import org.graalvm.compiler.graph.Graph
import sun.security.provider.certpath.Vertex

//В Kotlin функции могут быть объявлены в самом начале файла,
// что значит, что вам необязательно создавать класс, чтобы воспользоваться его функцией (как в Java, C# или Scala).
// В дополнение к этому, функции в Kotlin могут быть объявлены локально, как функции-члены и функции-расширения.

//Локальные функции
//Kotlin поддерживает локальные функции, т.е. функции, вложенные в другие функции.

//fun dfs(graph: Graph) {
//    fun dfs(current: Vertex, visited: MutableSet<Vertex>) {
//        if (!visited.add(current)) return
//        for (v in current.neighbors)
//            dfs(v, visited)
//    }
//
//    dfs(graph.vertices[0], HashSet())
//}

//fun dfs(graph: Graph) {
//    val visited = HashSet<Vertex>()
//    fun dfs(current: Vertex) {
//        if (!visited.add(current)) return
//        for (v in current.neighbors)
//            dfs(v)
//    }
//
//    dfs(graph.vertices[0])
//}

//Функции члены
//todo Функции-члены - это функции, объявленные внутри классов или объектов.
class Sample {
    fun foo() { print("Foo") }

    //Функции-члены вызываются с использованием точки.

    //Sample().foo() // создаёт инстанс класса Sample и вызывает его функцию foo

}





