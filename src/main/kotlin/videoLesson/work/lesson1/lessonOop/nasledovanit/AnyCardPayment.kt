package videoLesson.work.lesson1.lessonOop.nasledovanit

class AnyCardPayment(sum: Float, user: String, shopId: String = "332") : PaymentConstruct(sum, user, shopId) {
    val card = Card()
    override fun doPayment() {
        println("Проводим платеж картой")
    }

    fun cardAuthorizatie() {
        println("Проводим платеж картой" + card.getCardNumber())
    }

}

fun main() {
    val anyCardPayment = AnyCardPayment(12.2f,"Petr")
    anyCardPayment.doPayment()
    anyCardPayment.cardAuthorizatie()
}