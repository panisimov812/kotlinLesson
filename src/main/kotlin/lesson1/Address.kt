package lesson1

class Address {
    var name: String = "Petr"
    var street: String = "������"
    var city: String = "�����"
    var state: String? = null
    var zip: String = "1234"

    //��������� � ��������
fun copyAddress(address: Address): Address{
        val result = Address() //� ������ ��� ����� new
        result.name = address.name //����� ������ �������
        return result
}


}