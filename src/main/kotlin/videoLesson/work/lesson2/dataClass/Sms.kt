package videoLesson.work.lesson2.dataClass

import java.time.chrono.ChronoLocalDateTime

//классы используются исключтиительно для хранения данных о чем либо
class Sms(
    var phone: String = "",
    var time: String = "",
    var datetime: String = "",
    var from: String = "",
    var id: Long? = null,
    var content: String? = ""
) {
}