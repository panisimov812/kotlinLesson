package videoLesson.work.lesson1.lessonOop.abstruct

class WalletPayment(sum: Float,
                    user: String,
                    shopId: String) : Payment(sum,
                        user,
                        shopId) {
    override fun doPayment() {
        println("Делаем платеж с кошелька")
    }
}