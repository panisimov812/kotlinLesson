package documentation.functions//����� �����

//������� (������� ��������� ��� ��������� Int � ���������� Int
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b

//������� ������� �� ���������� �� ������ ��������
fun printSum(a: Int, b: Int): Unit {
    println("����� $a � $b ����� ${a + b}")
}

//��� ������������� �������� Unit ����� ���� ������.
fun printSum2(a: Int, b: Int) {
    println("����� $a � $b ����� ${a + b}")

}

fun double(x: Int): Int {
    return 2 * x
}

//����� �������
val summfunc = double(2)


//todo ��������� �������
//fun powerOf(number: Int, exponent: Int): Int { /*...*/ }
fun powerOf2(
    number: Int,
    exponent: Int, //����������� �������
) {/*...*/
}

//��������� �� ���������
//��������� ������� ����� ����� �������� �� ���������,
// ������� ������������ � ������, ���� �������� ������� �� ������ ��� � ������.
// ��� ��������� ������� ������� ��������������� ����.

fun read(
    b: ByteArray,
    off: Int = 0,
    len: Int = b.size,
) {/*...*/
}

//todo ��������������� �������
//��� ��������������� ������� �� ���������� �� ��������� � ��������� ��� ��������� ������ ���� �������.
open class A {
    open fun foo(i: Int = 10) {/*...*/
    }

    open class B : A() {
        override fun foo(i: Int) { /*...*/
        } // �������� �� ��������� ������� ������
    }
}


