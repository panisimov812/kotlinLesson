package videoLesson.work.lesson1.lessonOop.interfaces

class WalletPayment: Refundable {
    override fun refund(sum: Float) {
        println("Делаем возврат на кошелек")
    }
}