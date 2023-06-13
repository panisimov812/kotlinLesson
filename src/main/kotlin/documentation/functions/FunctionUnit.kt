package documentation.functions

//���� ������� �� ���������� �������� ��������� ��������, � ������������ ��� - Unit.
// Unit - ��� ������ � ����� ��������� - Unit. ��� �������� �� ��������� � ����� �������� ����������� �������.

fun printHello(name: String?): Unit {
    if (name != null)
        println("Hello $name")
    else
        println("Hi there!")
}
//�������� ���� Unit � �������� ������������� �������� ���� �� �������� ������������
// ���, ���������� ����, � ��������� ��� ���������� ���������:
 //fun printHello(name: String?) { /*...*/ }



