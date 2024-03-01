package homework_29.HashSet;
//6. **Удаление дубликатов из списка:**
//    - Создайте `ArrayList` с дублирующимися элементами.
//    - Преобразуйте `ArrayList` в `HashSet`, чтобы автоматически удалить дубликаты.
//    - Выведите новый список без дубликатов.
//    - Добавьте новые элементы в `HashSet` и снова преобразуйте его обратно в `ArrayList`.

import java.util.ArrayList;
import java.util.HashSet;

public class Task6 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("cat");
        arrayList.add("dog");
        arrayList.add("cat");
        arrayList.add("horse");
        arrayList.add("cow");
        arrayList.add("cat");

        System.out.println("ArrayList " + arrayList);

        HashSet<String> hashSet = new HashSet<>(arrayList);
        System.out.println("HashSet без дубликатов ");
        for (String element : hashSet) {
            System.out.println(element);
        }

        hashSet.add("ram");
        hashSet.add("goat");


        ArrayList<String> newArrayList = new ArrayList<>(hashSet);

        System.out.println("Новый ArrayList после добавления элементов " + newArrayList);
    }
}
