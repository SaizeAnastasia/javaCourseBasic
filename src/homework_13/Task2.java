package homework_13;

//Создайте массив из 5 случайных целых чисел из интервала [10;99]
//2.	Выведите его на консоль в строку.
//3.	Определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью.

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(90) + 10;

        }
        System.out.println(" Массив " + Arrays.toString(array));

        boolean isIncreasing = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i + 1]) {
                isIncreasing = false;
                break;
            }
        }
        if (isIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью.");

        }
    }
}