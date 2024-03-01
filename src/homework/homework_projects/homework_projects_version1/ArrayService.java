package homework.homework_projects.homework_projects_version1;

//Задание: Создайте класс ArrayService, содержащий метод sort,
//который принимает массив целых чисел и сортирует его по убыванию.
//
//Добавьте метод createArrayFromUserInput для чтения размера
//массива и его создания.
//
//Добавьте метод fillArrayFromUserInput для заполнения
//массива элементами от пользователя, возвращая созданный
//массив как ссылку.
//
//Добавьте метод printArray для вывода отсортированного массива.
//
//Реализуйте класс ArraySortDemo для демонстрации работы программы.

import java.util.Arrays;
import java.util.Scanner;

public class ArrayService {
    public static void sort(int[] arr) { // Объявление статического метода с именем sort, который принимает массив целых чисел в качестве параметраи не возвращает ничего(void).
        Arrays.sort(arr);                          // Метод сортирует массив arr по возрастанию с использованием метода sort.
        for (int i = 0; i < arr.length / 2; i++) {  // Блок кода реализует перестановку элементов массива, чтобы массив был отсортирован
            int temp = arr[i];                      // по убыванию. Он проходит через половину массива и меняет местами элементы с соответствующими
            arr[i] = arr[arr.length - 1 - i];       // им элементами с конца массива.
            arr[arr.length - 1 - i] = temp;
        }

    }

    public static int[] createArrayFromUserInput() { // Метод возвращает массив целых чисел.
        Scanner scanner = new Scanner(System.in);    // Создание Сканера для считывания ввода из стандартного ввода.
        System.out.println(" Введите размер массива: "); // Вывод на консоль  приглашения для пользователя ввести размер массива.
        int size = scanner.nextInt();         // Считывает целое число, введенное пользователем- размер массива.
        return new int[size];    // Создает новый массив целых чисел заданного размера  и возвращает его.

    }


    public static int[] fillArrayFromUserInput(int[] arr) { // Метод, принимающий массив целых чисел в качестве параметра и возвращает массив целых чисел.
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {    // Цикл for, чтобы пройтись по всем введенным пользователем с клавиатуры элементам в массиве arr.
            System.out.println(" Введите элемент: " + (i + 1) + " "); // Приглашение для пользователя ввести элемент массива с номером.
            arr[i] = scanner.nextInt(); // Считывает целое число, введенное пользователем и присваивает его i-му элементу массива arr.

        }
        return arr;
    }


    public static void printArray(int[] arr) { // Метод. Выводит массив чисел.
        System.out.println(" Отсортированный массив: "); // Метод выводит элементы массива arr, разделенные пробелами,
        for (int num : arr) {                            // с помощью цикла for- each
            System.out.println(num + " ");
        }
        System.out.println();
    }
}
