package homework_36.taskForCollections;
//7 Создать Stack, добавить в него несколько элементов. Проверить есть ли в коллекции заданный элемент.
// Если есть,то найти его глубину и вывести на экран.

import java.util.Stack;

public class Task7 {
    public static void main(String[] args) {
        // Создание Stack
        Stack<Integer> stack = new Stack<>();

        // Добавление элементов в Stack
        stack.push(5);
        stack.push(3);
        stack.push(7);
        stack.push(2);
        stack.push(8);

        // Проверка наличия заданного элемента в коллекции
        int searchElement = 7;
        if (stack.contains(searchElement)) {
            // Нахождение глубины заданного элемента
            int depth = stack.search(searchElement);

            // Вывод глубины элемента на экран
            System.out.println("Элемент " + searchElement + " найден на глубине " + depth);
        } else {
            System.out.println("Элемент " + searchElement + " не найден в коллекции");
        }
    }
}

