package videoLesson.work.lesson1.lessonOop.nasledovanit

open class PaymentConstruct(val sum: Float, val user: String, val shopId: String = "339") {
    var id = (0 until 10).random().toString()

    open fun doPayment(){
        println("Проводим платеж")
    }

    fun preparePayment(){
        println("Подготовка к выполнению платежа")
    }
}



