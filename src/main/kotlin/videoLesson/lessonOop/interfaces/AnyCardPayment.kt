package videoLesson.lessonOop.interfaces

class AnyCardPayment : Refundable {
    override fun refund(sum: Float) {
        println("Делаем возврат на банковскую карту")
    }


}