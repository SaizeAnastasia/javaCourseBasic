package homework_36.generics;
//2)  Напишите метод printList, который принимает список объектов и
//    выводит их на экран. Используйте Generics для обеспечения
//    типобезопасности и возможности передачи списка объектов любого типа.

import java.util.List;

public class Printer {
    public static <T> void printList(List<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        List<String> stringList = List.of("Apple", "Banana", "Orange");
        printList(stringList);

        List<Integer> integerList = List.of(1, 2, 3, 4, 5);
        printList(integerList);

        List<Double> doubleList = List.of(3.14, 2.718, 1.414);
        printList(doubleList);
    }
}
