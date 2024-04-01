package homework_36.taskForCollections;
//8 Создать ArrayDeque, добавить в него несколько элементов с каждой стороны,
// извлечь элементы с одной из сторон и вывести на экран.
import java.util.ArrayDeque;

public class Task8 {
    public static void main(String[] args) {
        // Создание ArrayDeque
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        // Добавление элементов с каждой стороны
        arrayDeque.addFirst(1);
        arrayDeque.addLast(2);
        arrayDeque.addFirst(3);
        arrayDeque.addLast(4);
        arrayDeque.addFirst(5);

        // Извлечение элементов с одной из сторон
        int firstElement = arrayDeque.pollFirst();
        int lastElement = arrayDeque.pollLast();

        // Вывод извлеченных элементов на экран
        System.out.println("Извлечен первый элемент: " + firstElement);
        System.out.println("Извлечен последний элемент: " + lastElement);
    }
}

