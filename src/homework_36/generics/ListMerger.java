package homework_36.generics;
//6)  Напишите метод merge, который принимает два отсортированных списка и
//    возвращает объединенный отсортированный список. Используйте Generics
//    для обеспечения возможности передачи в метод списков любого типа.

import java.util.ArrayList;
import java.util.List;

public class ListMerger {
    public static <T extends Comparable<T>> List<T> merge(List<T> list1, List<T> list2) {
        List<T> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).compareTo(list2.get(j)) < 0) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }

    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 3, 5, 7, 9);
        List<Integer> list2 = List.of(2, 4, 6, 8, 10);

        List<Integer> mergedList = merge(list1, list2);
        System.out.println("Merged and sorted list: " + mergedList);
    }
}

