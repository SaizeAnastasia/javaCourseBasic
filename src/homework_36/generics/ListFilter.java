package homework_36.generics;
//8)  Напишите метод filter, который принимает список объектов и предикат,
//    и возвращает список объектов, удовлетворяющих предикату. Используйте
//    Generics для обеспечения возможности передачи в метод списка объектов
//    любого типа.

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ListFilter {
    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T item : list) {
            if (predicate.test(item)) {
                filteredList.add(item);
            }
        }
        return filteredList;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Predicate<Integer> evenPredicate = n -> n % 2 == 0;

        List<Integer> evenNumbers = filter(numbers, evenPredicate);
        System.out.println("Even numbers: " + evenNumbers);

        List<String> words = List.of("apple", "banana", "orange", "pear", "grape");
        Predicate<String> startsWithAPredicate = s -> s.startsWith("a");

        List<String> aWords = filter(words, startsWithAPredicate);
        System.out.println("Words starting with 'a': " + aWords);
    }
}

