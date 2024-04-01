package homework_36.generics;
//4)  Напишите метод findMax, который принимает массив объектов и возвращает
//    наибольший из них. Используйте Generics для обеспечения возможности
//    передачи массива объектов любого типа.

public class MaxFinder {
    public static <T extends Comparable<T>> T findMax(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 3, 5, 2, 4};
        System.out.println("Max Integer: " + findMax(intArray));

        Double[] doubleArray = {3.14, 2.718, 1.414};
        System.out.println("Max Double: " + findMax(doubleArray));

        String[] stringArray = {"apple", "banana", "orange", "pear"};
        System.out.println("Max String: " + findMax(stringArray));
    }
}

