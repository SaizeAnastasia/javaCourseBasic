package homework_36.taskForCollections;
//9 Создать TreeMap, где ключом является число типа Integer, а значением - его факториал.
// Вывести на экран все элементы TreeMap.

import java.util.Map;
import java.util.TreeMap;

public class Task9 {
    public static void main(String[] args) {
        // Создание TreeMap
        Map<Integer, Long> treeMap = new TreeMap<>();

        // Добавление пар ключ-значение: число - факториал
        for (int i = 1; i <= 10; i++) {
            long factorial = factorial(i);
            treeMap.put(i, factorial);
        }

        // Вывод всех элементов TreeMap на экран
        System.out.println("Элементы TreeMap:");
        for (Map.Entry<Integer, Long> entry : treeMap.entrySet()) {
            System.out.println("Число: " + entry.getKey() + ", Факториал: " + entry.getValue());
        }
    }

    // Функция для вычисления факториала
    private static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

