package videoLesson.work.lesson1.lessonOop.abstruct

abstract class Payment(Sum: Float, user: String, shopId: String) {

    abstract fun doPayment() // ������ ����� ����������� ������ ��� ����� ��� ������������� � ������ �������
    fun preparePyament() {
        println("���������� � ���������� �������")
    }
}