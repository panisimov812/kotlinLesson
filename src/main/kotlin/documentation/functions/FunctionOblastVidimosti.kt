package documentation.functions

import org.graalvm.compiler.graph.Graph
import sun.security.provider.certpath.Vertex

//� Kotlin ������� ����� ���� ��������� � ����� ������ �����,
// ��� ������, ��� ��� ������������� ��������� �����, ����� ��������������� ��� �������� (��� � Java, C# ��� Scala).
// � ���������� � �����, ������� � Kotlin ����� ���� ��������� ��������, ��� �������-����� � �������-����������.

//��������� �������
//Kotlin ������������ ��������� �������, �.�. �������, ��������� � ������ �������.

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

//������� �����
//todo �������-����� - ��� �������, ����������� ������ ������� ��� ��������.
class Sample {
    fun foo() { print("Foo") }

    //�������-����� ���������� � �������������� �����.

    //Sample().foo() // ������ ������� ������ Sample � �������� ��� ������� foo

}





