package homework.homework_19;

//3. Создайте массив из 8 случайных целых чисел из отрезка [1;10]
//   Отсортируйте массив по убыванию любым из алгоритмов.


import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[8];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;

        }
        System.out.println(" Неотсортированный массив " + Arrays. toString(array));

        Arrays.sort(array);
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;


        }
        System.out.println(" Отсортированный массив  по убыванию" + Arrays. toString(array));
    }
}
