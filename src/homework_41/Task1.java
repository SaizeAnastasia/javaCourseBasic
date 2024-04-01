package homework_41;
//Задача 1: Фильтрация и сортировка коллекции
//
//Задание: Дан список строк.
//Необходимо отфильтровать из этого списка все строки,
//которые начинаются на букву "A" (без учёта регистра), и
//вернуть список этих строк, отсортированный в алфавитном порядке.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
        public static void main(String[] args) {
            // Исходный список строк
            List<String> strings = Arrays.asList("Apple", "Banana", "apricot", "Avocado", "Orange", "grape");

            // Фильтрация и сортировка списка строк
            List<String> filteredAndSortedStrings = strings.stream()
                    .filter(s -> s.toLowerCase().startsWith("a"))
                    .sorted(String.CASE_INSENSITIVE_ORDER)
                    .collect(Collectors.toList());

            // Вывод отфильтрованного и отсортированного списка строк
            System.out.println("Отфильтрованный и отсортированный список строк:");
            filteredAndSortedStrings.forEach(System.out::println);
        }
    }


