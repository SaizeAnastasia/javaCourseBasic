package homework_40;
//3) коллекция String - получить строку содержащую все элементы этой коллекции

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        // Создаем коллекцию строк
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("orange");
        strings.add("grape");
        strings.add("kiwi");

        // Получаем строку, содержащую все элементы коллекции, разделенные запятой
        String result = strings.stream()
                .collect(Collectors.joining(", "));

        // Вывод строки на экран
        System.out.println("Строка содержащая все элементы коллекции:");
        System.out.println(result);
    }
}

