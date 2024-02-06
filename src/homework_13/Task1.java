package homework_13;

//1.	Создайте массив из 8 случайных целых чисел из интервала [1;50]
//2.	Выведите массив на консоль в строку.
//3.	Замените каждый элемент с нечетным индексом на ноль.
//4.	Снова выведете массив на консоль в отдельной строке.

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] num = generateRandomArray(8,1,50);
        System.out.println( " Исходный массив " + Arrays.toString(num));

        replaceOddIndicesWithZero(num);

        System.out.println(" После замены нечетных индексов на 0 " + Arrays.toString(num));
    }

    private  static  int[] generateRandomArray(int size, int min, int max){
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
            return array;
    }
    private  static void replaceOddIndicesWithZero(int[] array) {
        for (int i = 1; i < array.length; i+=2) {
            array[i] = 0;
            }

        }
    }

