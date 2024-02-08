package homework.homework_14;

import java.util.Random;

// №3
//1. Создайте массив из 15 случайных целых чисел из отрезка [0;9].
//2. Подсчитайте сколько в массиве чётных элементов и выведете это
//   количество на экран на отдельной строке.
public class Task3 {
    public static void main(String[] args) {
        int[] numbers = new int[15];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }
        int countEven = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                countEven++;

            }

        }
        System.out.println(" Количество четных элементов в массиве : " + countEven);
    }
}
