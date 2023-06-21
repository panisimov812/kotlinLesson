package videoLesson.work.lesson1.lessonOop.composition

class AnyCardPayment(sum: Float, name: String, id: Int = 12) {
    val cardInfo = CardInformation()
    fun getPay(){
        println("Платеж совершен")
    }

    fun getInfoAboutCard(){
        println("Инфо о номере карты: " + cardInfo.getCardNumber() + "и ее cvc" + cardInfo.getCvc())
    }
}

fun main() {
    val anyCardPayment = AnyCardPayment(12.4f,"Petr")
    anyCardPayment.getInfoAboutCard()
    anyCardPayment.getPay()
}