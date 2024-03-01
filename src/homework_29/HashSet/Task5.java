package homework_29.HashSet;
//5. **Уникальный набор имен:**
//    - Создайте `HashSet` для хранения имен.
//    - Добавьте в набор десять имен, некоторые из которых могут повторяться.
//    - Выведите количество уникальных имен в наборе.
//    - Проверьте, содержит ли набор определенное имя.

import java.util.HashSet;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        HashSet<String> name = new HashSet<>();

        name.add("Anastasia");
        name.add("Sergej");
        name.add("Alisa");
        name.add("Philipp");
        name.add("Melissa");
        name.add("Elena");
        name.add("Evgenij");
        name.add("Alisa");
        name.add("Nikolaj");
        name.add("Sergej");

        System.out.println(" Список имен " + name);

        System.out.println(" Количество уникальных имен: " + name.size());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя ");
        String enteredName = scanner.nextLine();
        if (name.contains(enteredName)) {
            System.out.println(" Набор содержит имя " + enteredName);

        } else {
            System.out.println("Имя не найдено " + enteredName);
        }


    }
}
