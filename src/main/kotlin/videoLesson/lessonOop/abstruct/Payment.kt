package videoLesson.lessonOop.abstruct

abstract class Payment(Sum: Float, user: String, shopId: String) {

    abstract fun doPayment() // ������ ����� ����������� ������ ��� ����� ��� ������������� � ������ �������
    fun preparePyament() {
        println("���������� � ���������� �������")
    }
}