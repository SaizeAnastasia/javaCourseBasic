package lessons.lessons_31;

//дан список целых чисел
//написать метод, который удаляет из него все числа, которые больше заданного X
//
//в качестве результата выведите измененный список

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Numbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);

        int x = 15;

        removeNumber(numbers, x);

        System.out.println(" Измененный список " + numbers);

    }

    public static void removeNumber(List<Integer> numbers, int x) {
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() > x) {
                iterator.remove();
            }
        }
    }
}
