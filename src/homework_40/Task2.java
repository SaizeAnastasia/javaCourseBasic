package homework_40;
//2) коллекция String  - получить коллекцию элементов у которых нечетное количество символов

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        // Создаем коллекцию строк
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("orange");
        strings.add("grape");
        strings.add("kiwi");

        // Фильтрация коллекции строк по нечетной длине
        List<String> oddLengthStrings = strings.stream()
                .filter(s -> s.length() % 2 != 0)
                .collect(Collectors.toList());

        // Вывод отфильтрованной коллекции
        System.out.println("Элементы с нечетным количеством символов:");
        for (String str : oddLengthStrings) {
            System.out.println(str);
        }
    }
}

