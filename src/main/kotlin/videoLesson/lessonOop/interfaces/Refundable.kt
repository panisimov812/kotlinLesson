package videoLesson.lessonOop.interfaces

interface Refundable {
    fun refund(sum: Float)

    fun checkReFaundStatus(id: String): String {
        return "success"
    }
}