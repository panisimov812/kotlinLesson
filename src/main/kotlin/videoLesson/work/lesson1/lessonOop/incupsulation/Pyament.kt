package videoLesson.work.lesson1.lessonOop.incupsulation

abstract class Pyament {
    protected abstract fun doPayment()

    fun preparePayment() {
        println("���������� � ���������� �������")
    }
    private fun saveToDB(){ // ����� ������� ���� ����� ������ � ���� ������
        println("��������� ������ � ��")

    }
}