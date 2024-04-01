package homework_36.generics;
//5)  Создайте класс Stack, реализующий стек на основе массива или списка.
//    Используйте Generics для обеспечения типобезопасности и возможности
//    передачи в стек объектов разных типов.

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack<T> {
    private ArrayList<T> stack;

    public Stack() {
        stack = new ArrayList<>();
    }

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() - 1);
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);

        System.out.println("Top element: " + intStack.peek());
        System.out.println("Popping elements:");
        while (!intStack.isEmpty()) {
            System.out.println(intStack.pop());
        }

        Stack<String> stringStack = new Stack<>();
        stringStack.push("Hello");
        stringStack.push("World");

        System.out.println("Top element: " + stringStack.peek());
        System.out.println("Popping elements:");
        while (!stringStack.isEmpty()) {
            System.out.println(stringStack.pop());
        }
    }
}
