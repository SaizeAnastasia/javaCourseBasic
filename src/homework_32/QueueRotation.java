package homework_32;
//# Задача "Ротация очереди"
//
//Описание: Дана очередь целых чисел и число k, представляющее количество
//операций ротации, которые необходимо выполнить с очередью.
//Ротация очереди означает перемещение последнего элемента очереди в её начало.
//Реализуйте функцию, которая модифицирует очередь, выполняя k ротаций.
//
//Цель: Написать функцию, которая принимает очередь и число k, затем
//выполняет k ротаций очереди.

import java.util.Queue;

public class QueueRotation {
    public static void rotateQueue(Queue<Integer> queue, int k) {
        if (queue.isEmpty() || k == 0) {
            return;
        }

        for (int i = 0; i < k; i++) {
            int size = queue.size();
            int lastElement = queue.poll();
            queue.add(lastElement);

            for (int j = 0; j < size; j++) {
                int element = queue.poll();
                queue.add(element);

            }

        }
    }
}
