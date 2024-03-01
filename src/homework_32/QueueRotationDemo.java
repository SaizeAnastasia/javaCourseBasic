package homework_32;

import java.util.LinkedList;
import java.util.Queue;

import static homework_32.QueueRotation.rotateQueue;

public class QueueRotationDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println(" Исходная очередь " + queue);
        int k = 4;

        rotateQueue(queue, k);
        System.out.println(" После " + k + " ротаций " + queue);
    }
}
