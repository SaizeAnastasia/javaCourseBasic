package homework_36.taskForCollections;
//2 Создать LinkedList из 10 элементов, удалить элементы с индексами, которые хранятся другой коллекции
// в Set и вывести на экран, то что останется от List.

import java.util.LinkedList;
import java.util.HashSet;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        // Создание LinkedList и добавление элементов
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");
        list.add("H");
        list.add("I");
        list.add("J");

        // Создание Set с индексами элементов для удаления
        Set<Integer> indexesToRemove = new HashSet<>();
        indexesToRemove.add(1);
        indexesToRemove.add(3);
        indexesToRemove.add(5);

        // Удаление элементов с указанными индексами
        for (int index : indexesToRemove) {
            if (index >= 0 && index < list.size()) {
                list.remove(index);
            }
        }

        // Вывод на экран оставшихся элементов LinkedList
        System.out.println("Элементы после удаления:");
        for (String item : list) {
            System.out.println(item);
        }
    }
}

