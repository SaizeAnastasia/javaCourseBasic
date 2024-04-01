package lessons.lessons_31;
//Дан список String
//написать метод, который заменяет все элементы, которые содержат букву 'a'
//на "..."

import java.util.ArrayList;
import java.util.List;

public class Text {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("computer");
        strings.add("dog");
        strings.add("grape");

        replaceStringsWithA(strings);

        System.out.println(" Измененный список " + strings);
    }

    public static void replaceStringsWithA(List<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).contains("a")) {
                strings.set(i, "...");
            }

        }
    }
}
