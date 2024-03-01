package homework_32;

import java.util.Stack;

import static homework_32.StackSort.sortStack;

public class StackSortDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(9);
        stack.push(6);
        stack.push(11);

        System.out.println("Исходный стек " + stack);

        sortStack(stack);

        System.out.println("Отсортированный стек " + stack);
    }
}
