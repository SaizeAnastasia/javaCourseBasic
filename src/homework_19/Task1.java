package homework_19;
//1. Напишите программу, которая меняет местами элементы одномерного массива из String в обратном порядке.
//   Не используйте дополнительный массив для хранения результатов.
public class Task1 {
    public static void main(String[] args) {
        String[] array = {" мама ", " мыла ", " раму"};

        System.out.println("Оригинальный массив ");
        printArray(array);

        reverseArray(array);

        System.out.println(" Измененный массив");
        printArray(array);

    }

    private static void printArray(String[] array) {
        for (String element : array) {
            System.out.println( element + " ");
        }
        System.out.println();
    }

    public static void reverseArray(String[] array) {
            int length = array.length;
            for (int i = 0; i < length / 2; i++) {
                String temp = array[i];
                array[i] = array[length - i - 1];
                array[length - i - 1] = temp;

            }

        }


    }
