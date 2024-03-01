package homework_32;
//# Задача "Очередь приоритетов"
//
//Описание: Реализуйте структуру данных "Очередь приоритетов",
//которая поддерживает стандартные операции добавления элемента и извлечения
//элемента с наивысшим приоритетом. Приоритет каждого элемента определяется
//в момент добавления в очередь.
//
//Цель: Создать класс PriorityQueue с методами enqueue(element, priority) для
//добавления элемента с определенным приоритетом и dequeue(), который извлекает
//и возвращает элемент с наивысшим приоритетом.
//Если два элемента имеют одинаковый приоритет, они должны быть обработаны по
//принципу FIFO.

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<PriorityQueueElement> queue;

    public PriorityQueue() {
        queue = new LinkedList<>();
    }

    public void enqueue(PriorityQueueElement priorityQueueElement, int priority) {
        priorityQueueElement.priority = priority;
        queue.add(priorityQueueElement);
    }

    public PriorityQueueElement dequeue() {
        if (isEmpty()) {
            return null;
        }

        PriorityQueueElement highestPriorityElement = queue.get(0);
        int highestPriorityIndex = 0;

        for (int i = 1; i < queue.size(); i++) {
            if (queue.get(i).priority > highestPriorityElement.priority){
                highestPriorityElement = queue.get(i);
                highestPriorityIndex = i;
            }

        }
        return queue.remove(highestPriorityIndex);
    }

    public boolean isEmpty(){
        return queue. isEmpty();
    }


}
