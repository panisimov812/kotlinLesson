package documentation.functions
//todo ��� ������ ������� �� ������ ���� ������� ����� ������ ��� ���������� ����������.
// ��� ����� ���� �������, ����� � ������� ������� ������ ����������, � ������ ������� �������� � ����������,
// �������� ���� ��� ���������� ��� null ��������.
//
//��� ����� ���������� ���� ���������� � ������ �������, �� ������ ��������
// �������� ������� �� ������������, �, ���� �� ������ ������������ �� �������� ��
// ���������, �� ������ ������ ���������� ��� ���������.

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