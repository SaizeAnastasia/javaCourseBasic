package homework.homework_14;
//№4
//1. Создать массив типа String с размером 7.
//2. Записать в него значения дней недели.
//3. Вывести на консоль значение последнего элемента.

public class Task4 {
    public static void main(String[] args) {
        String[] daysOfWeek = new String[7];
        daysOfWeek[0] = "Понедельник";
        daysOfWeek[1] = "Вторник";
        daysOfWeek[2] = "Среда";
        daysOfWeek[3] = "Четверг";
        daysOfWeek[4] = "Пятница";
        daysOfWeek[5] = "Суббота";
        daysOfWeek[6] = "Воскресенье";

        System.out.println(" Последний день недели " + daysOfWeek[6]);

    }
}
