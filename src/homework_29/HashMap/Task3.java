package homework_29.HashMap;
//**Словарь перевода слов:**
//    - Создайте `HashMap`, где ключом является слово на английском языке, а значением - его перевод на другой язык.
//    - Добавьте в словарь пять пар слов.
//    - Выведите перевод слова, введенного пользователем.
//    - Удалите слово из словаря и выведите обновленный список слов.

import java.util.HashMap;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        HashMap<String, String> vocabulary = new HashMap<>();

        vocabulary.put("dog", "собака");
        vocabulary.put("apple", "яблоко");
        vocabulary.put("cat", "кот");
        vocabulary.put("book", "книга");
        vocabulary.put("heart", "сердце");

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите слово на английском языке ");
        String word = scanner.nextLine();
        String translation = vocabulary.get(word);
        if (translation != null) {
            System.out.println(" Перевод слова " + word + "-" + translation);

        }  else {
            System.out.println(" Перевод слова " + word + "-" + " Не найдено ");
        }

        String removeWord = "cat";
        vocabulary.remove(removeWord);
        System.out.println(" Обновленный список слов");

        for (String key : vocabulary.keySet()) {
            System.out.println(key + "-" + vocabulary.keySet());
        }


    }
}
