package documentation.functions
//����� ������� ���������� ���� ������������ ���������, �������� ������ { } ����� ���� �������,
// � ���� ������� ����� ���� ������� ����� ����� =.


//fun double(x: Int): Int = x * 2

//��������������� ����� ���������� varargs

fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) //ts - ��� ������ (Array)
        result.add(t)
    return result
}

//�������� ���������� �������� � �������� ����������
val list = asList(1, 2, 3)