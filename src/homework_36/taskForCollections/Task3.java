package homework_36.taskForCollections;
//3 Создать HashMap, где ключом является число типа Integer, а значением - его квадрат.
// Вывести на экран все элементы HashMap.

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
            // Создание HashMap
        Map<Integer, Integer> hashMap = new HashMap<>();

            // Заполнение HashMap квадратами чисел от 1 до 10
            for (int i = 1; i <= 10; i++) {
                hashMap.put(i, i * i);
            }

            // Вывод всех элементов HashMap на экран
            System.out.println("Элементы HashMap:");
            for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
                System.out.println("Ключ: " + entry.getKey() + ", Значение: " + entry.getValue());
            }
        }
    }


