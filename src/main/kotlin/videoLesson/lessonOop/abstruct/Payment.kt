package videoLesson.lessonOop.abstruct

abstract class Payment(Sum: Float, user: String, shopId: String) {

    abstract fun doPayment() // данный метод абстрактный потому что будем его реализовывать в других классах
    fun preparePyament() {
        println("ѕодготовка к выполнению платежа")
    }
}