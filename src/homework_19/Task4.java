package homework_19;

//4. Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый
//   Выведите массивы на экран в двух отдельных строках
//   Посчитайте среднее арифметическое элементов каждого массива и сообщите,
//   для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны)

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array1 = generateRandomArray(5);
        int[] array2 = generateRandomArray(5);

        System.out.println( "Массив 1 " + Arrays.toString(array1));
        System.out.println( "Массив 2 " + Arrays.toString(array2));

        double average1 = calculateAverage(array1);
        double average2 = calculateAverage(array2);

        if (average1 > average2) {
            System.out.println(" Среднее арифметическое значение в массиве 1 больше " + average1);
        } else if (average1 < average2) {
            System.out.println(" Среднее арифметическое значение в массиве 2 больше " + average2);
        } else {
            System.out.println(" Средние арифметические значения в обоих массивах равны " + average1);
        }
    }

    public static int[] generateRandomArray(int length) {
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(6);
        }
        return array;
    }

    public static double calculateAverage(int[] array) {
        double sum = 0;
        for (int num : array) {
            sum += num;

        }
        return sum / array.length;
    }
}
