package videoLesson.work.lesson2.getterSetter

import java.math.BigDecimal

class Payment(var paymentType: String) {

    val id: String = paymentType.plus(1)

    var sum : BigDecimal = BigDecimal(0.0)
        get() = field.abs()
        set(value) {
            field = value.setScale(2, BigDecimal.ROUND_HALF_DOWN)
        }
}