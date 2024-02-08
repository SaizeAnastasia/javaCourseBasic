package homework.homework_09.task4;

//Реализовать с использованием **switch**
//Ваш ребенок принес оценку за контрольную работу по математике. В школе 12 бальная система.
//Запишите в переменную случайное число от 0 до 12.
//Вы разрешаете ребенку смотреть телевизор не более 60 минут в день.  (Оставшееся время не может быть больше 1 часа)
//На сегодня у него осталось 45 минут. (записать в переменную)
//
//Если оценка от 10 до 12 баллов -> Скажите ему, как вы рады и добавьте к оставшемуся на сегодня времени 1 час
//от 7 до 9 -> Слова похвалы на экран + ко времени 45 минут
//от 4 до 6 -> Нейтральные слова + ко времени 15 минут
//3 -> Огорчитесь. Минус 30 минут ко времени
//оценка меньше -> Трагедия. Сегодня ТВ смотреть запрещено
//
//Выведите на экран оставшееся на сегодня время для просмотра ТВ

import java.util.Random;

public class Grade {
    public static void main(String[] args) {
        int remainingTime = 45;
        int grade = getRandomGrade();

        System.out.println("Оценка");

        switch (grade){
            case 10:
            case 11:
            case 12:
                System.out.println("Поздравляю! Ты молодец!");
                remainingTime += 60;
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Хвалю ");
                remainingTime += 45;
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Неплохо ");
                remainingTime += 15;
                break;
            case 3:
                System.out.println("Огорчаюсь ");
                remainingTime -= 30;
                break;
            default:
                System.out.println("Трагедия ");
                remainingTime = 0;
    }
        System.out.println("Оставшееся время для просмотра телевизора:" + remainingTime +"минут");
    }

        public static int getRandomGrade() {
        Random random = new Random();
        return random.nextInt(13);
    }
}
