package homework_36.taskForCollections;
//10 Создать HashSet из нескольких элементов, создать LinkedList из тех же элементов и
// вывести на экран элементы LinkedList в том порядке, в котором они были добавлены.

import java.util.HashSet;
import java.util.LinkedList;

public class Task10 {
    public static void main(String[] args) {
        // Создание HashSet и добавление элементов
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("orange");

        // Создание LinkedList и добавление тех же элементов
        LinkedList<String> linkedList = new LinkedList<>(hashSet);

        // Вывод элементов LinkedList в том порядке, в котором они были добавлены
        System.out.println("Элементы LinkedList в порядке добавления:");
        for (String item : linkedList) {
            System.out.println(item);
        }
    }
}

