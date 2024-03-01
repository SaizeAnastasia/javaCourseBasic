package homework_29.ListTasks;
//2. **Операции с числовым списком:**
//    - Создайте `LinkedList` для хранения целых чисел.
//    - Добавьте в список случайные числа в диапазоне от 1 до 100.
//    - Найдите и выведите максимальное и минимальное числа в списке.
//    - Отсортируйте список в порядке возрастания и выведите его.

import java.util.Collections;
import java.util.LinkedList;

public class Task2 {

    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(37);
        numbers.add(4);
        numbers.add(47);
        numbers.add(18);
        numbers.add(99);
        numbers.add(78);
        numbers.add(11);
        numbers.add(94);



        int maxNumber = Collections.max(numbers);
        System.out.println(" Максимальное число " + maxNumber);

        int minNumber = Collections.min(numbers);
        System.out.println(" Минимальное число " + minNumber);

        Collections.sort(numbers);
        System.out.println(" Отсортированный список ");
        System.out.println(numbers);
    }
}
