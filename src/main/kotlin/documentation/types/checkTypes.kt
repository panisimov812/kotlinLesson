package documentation.types

//��������� is � !is
//����������� �������� is ��� ��� ��������� !is, ����� ��������� ������������� �� ������ ��������� ���� �� ����� ����������.

/*
if (obj is String) {
    print(obj.length)
}

if (obj !is String) { // �� �� �����, ��� � !(obj is String)
    print("Not a String")
}
else {
    print(obj.length)
}
 */

fun demo(x: Any){
    if (x is String) {
        println(x.length) // x ������������� ����������������� � String
    }
}


fun main() {
    demo("dfs")
}