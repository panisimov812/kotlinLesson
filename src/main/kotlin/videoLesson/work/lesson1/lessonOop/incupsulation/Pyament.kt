package videoLesson.work.lesson1.lessonOop.incupsulation

abstract class Pyament {
    protected abstract fun doPayment()

    fun preparePayment() {
        println("Подготовка к выполнению платежа")
    }
    private fun saveToDB(){ // можем дергать этот метод только в этом классе
        println("Сохраняем данные в БД")

    }
}