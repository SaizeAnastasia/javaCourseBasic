package homework_32;
//Задача "Сортировка стека"
//
//Описание: Дан стек целых чисел, который нужно отсортировать так,
//чтобы наименьшие элементы оказались на вершине.
//Вы можете использовать дополнительный временный стек,
//но вы не должны копировать элементы в другие структуры данных (например, массивы).
//Стек поддерживает следующие операции: push, pop, peek и isEmpty.
//
//Цель: Написать функцию, которая отсортирует стек в порядке возрастания
//элементов сверху вниз.

import java.util.Stack;

public class StackSort {
    public static void sortStack(Stack<Integer> stack){
        Stack<Integer> tempStack = new Stack<>();

        while (!stack.isEmpty()) {
            int temp = stack.pop();

            while (!tempStack.isEmpty() && tempStack.peek() < temp) {
                stack.push(tempStack.pop());
            }

            tempStack.push(temp);

        }

        while (!tempStack. isEmpty()) {
            stack.push(tempStack.pop());
        }
    }


}
