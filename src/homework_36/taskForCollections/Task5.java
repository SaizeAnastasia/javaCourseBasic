package homework_36.taskForCollections;
//5 Создать TreeMap, где ключом является строка, а значением - ее длина. Вывести на экран все элементы TreeMap.

import java.util.Map;
import java.util.TreeMap;

public class Task5 {
    public static void main(String[] args) {
        // Создание TreeMap
        Map<String, Integer> treeMap = new TreeMap<>();

        // Добавление элементов в TreeMap
        treeMap.put("apple", "apple".length());
        treeMap.put("banana", "banana".length());
        treeMap.put("orange", "orange".length());

        // Вывод всех элементов TreeMap на экран
        System.out.println("Элементы TreeMap:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + ", Значение: " + entry.getValue());
        }
    }
}
