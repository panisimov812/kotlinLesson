package videoLesson.lessonOop.interfaces

class AnyCardPayment : Refundable {
    override fun refund(sum: Float) {
        println("������ ������� �� ���������� �����")
    }


}