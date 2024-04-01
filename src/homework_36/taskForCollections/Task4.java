package homework_36.taskForCollections;
//4 Создать HashSet, добавить в него несколько строк и проверить, содержит ли он определенную строку.

import java.util.HashSet;
import java.util.Set;

public class Task4 {
    public static void main(String[] args) {
        // Создание HashSet
        Set<String> hashSet = new HashSet<>();

        // Добавление строк в HashSet
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("orange");

        // Проверка, содержит ли HashSet определенную строку
        String searchString = "banana";
        if (hashSet.contains(searchString)) {
            System.out.println("HashSet содержит строку: " + searchString);
        } else {
            System.out.println("HashSet не содержит строку: " + searchString);
        }
    }
}

