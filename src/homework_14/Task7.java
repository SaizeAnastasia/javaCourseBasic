package homework_14;
//№7 **
//Создать массив размера , полученного от пользователя
//Наполнить этот массив случайными числами в диапазоне до 100
//- найти максимум среди элементов массива и его индекс (если значения повторяются то найти первый)
//- найти сумму всех элементов
//
//если максимальный элемент повторяется несколько раз то создать массив из индесов
//
//в идеале - оформить основные модули вашей программы отдельными методами

import java.util.Random;
import java.util.Scanner;


public class Task7 {
    public static void main(String[] args) {

        int size= getArraySizeFromUser(); // получаем размер массива от пользователя

        int[] array= createRandomArray(size); // Создаем массив

        System.out.println(" Массив случайных чисел: "); // Выводим массив на экран
        printArray(array);

        int[] maxIndexes = findMaxIndex(array); // Находим максимальный элемент и его индекс
        System.out.println( "Максимальный элемент: " + array[maxIndexes[0]] + " с индексом ");
        printArray(maxIndexes);

        int sum = ArraySum(array); // Находим сумму всех элементов массива
        System.out.println(" Сумма всех элементов массива: " + sum);

    }
    public static int getArraySizeFromUser() {     //Метод для получения размера массива
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите размер массива: ");

        int size = scanner.nextInt();
        return size;
    }

    public static int[] createRandomArray(int size) { // Метод для создания массива и заполнения его случайными числами
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }
        return new int[]{size};
    }

    public static void printArray(int[] array){  //Метод для вывода массива на экран
        for(int num : array);
        System.out.println(array + " ");
    }

    public static int[] findMaxIndex(int[]array) {  //Метод для нахождения индекса максимального элемента
        int max = array[0];
        int[] maxIndexes = new int[array.length];
        int maxIndexCount = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
                maxIndexes[0] = i;
                maxIndexCount = 1;
            } else if(array[i] == max){
                maxIndexes[maxIndexCount] = i;
                maxIndexCount++;
            }

        }
        int[]realMaxIndexes = new int[maxIndexCount]; //Если максимальный элемент повторяется, уменьшаем массив индексов до количества реальных максимумов
        for (int i = 0; i < maxIndexCount; i++) {
            realMaxIndexes[i] = maxIndexes[i];
        }
        return maxIndexes;
    }

    public static int ArraySum(int[] array){  //Метод для вычисления суммы всех элементов массива
        int sum = 0;
        for (int i = 0; i < array.length; i++ ) {
            sum += array[i];
        }
        return sum;
    }



}
