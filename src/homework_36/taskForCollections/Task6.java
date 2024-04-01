package homework_36.taskForCollections;
//6 Создать PriorityQueue из 10 элементов типа Integer, добавить несколько элементов,
// извлечь минимальный элемент и вывести на экран.

import java.util.PriorityQueue;

public class Task6 {
    public static void main(String[] args) {
        // Создание PriorityQueue из 10 элементов типа Integer
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(5);
        priorityQueue.add(2);
        priorityQueue.add(9);
        priorityQueue.add(1);
        priorityQueue.add(7);
        priorityQueue.add(3);
        priorityQueue.add(6);
        priorityQueue.add(8);
        priorityQueue.add(4);
        priorityQueue.add(10);

        // Добавление еще нескольких элементов
        priorityQueue.add(0);
        priorityQueue.add(12);

        // Извлечение минимального элемента
        Integer minElement = priorityQueue.poll();

        // Вывод минимального элемента на экран
        System.out.println("Минимальный элемент: " + minElement);
    }
}

