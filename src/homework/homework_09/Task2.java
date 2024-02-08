package homework.homework_09;

//Запишите в 4 переменные случайные числа от 0 до 100
//- Выведите все 4 на экран
//- Программа должна определить максимальное из этих четырех чисел
//- Результат вывести на экран

import java.util.Random;

public class Task2 {

    public static void main(String[] args) {

        int num1 = getRandomNumber();
        int num2 = getRandomNumber();
        int num3 = getRandomNumber();
        int num4 = getRandomNumber();

        System.out.println("Случайные числа: " + num1 + "," + num2 + "," + num3 + "," + num4);

        int maxNum = Math.max(Math.max(num1 , num2), Math.max(num3 , num4));

        System.out.println("Максимальное число:" + maxNum);
    }

    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(101);
    }
}
