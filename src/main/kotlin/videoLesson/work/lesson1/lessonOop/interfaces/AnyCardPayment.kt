package videoLesson.work.lesson1.lessonOop.interfaces

class AnyCardPayment : Refundable {
    override fun refund(sum: Float) {
        println("Делаем возврат на банковскую карту")
    }


}