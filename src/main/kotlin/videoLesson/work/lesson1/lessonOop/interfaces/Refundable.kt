package videoLesson.work.lesson1.lessonOop.interfaces

interface Refundable {
    fun refund(sum: Float)

    fun checkReFaundStatus(id: String): String {
        return "success"
    }
}