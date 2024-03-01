package homework_32;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();

        priorityQueue.enqueue(new PriorityQueueElement("A"), 2);
        priorityQueue.enqueue(new PriorityQueueElement("B"),1);
        priorityQueue.enqueue(new PriorityQueueElement("C"),3);

        System.out.println(priorityQueue.dequeue().data);
        System.out.println(priorityQueue.dequeue().data);
        System.out.println(priorityQueue.dequeue().data);


    }
}
