package homework_30;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeSet;

public class SuitCaseDemo {

    public static void main(String[] args) {
        Comparator<SuitCase> comparator = Comparator
                .comparing(SuitCase::getSize)
                .thenComparing(SuitCase::getMaterial)
                .thenComparing(SuitCase::getColor);


         TreeSet<SuitCase> treeSet = new TreeSet<>(comparator);
        LinkedList<SuitCase> linkedList = new LinkedList<>();


        treeSet.add(new SuitCase("Пластик", "L", "Красный"));
        treeSet.add(new SuitCase("Ткань", "M", "Синий"));
        treeSet.add(new SuitCase("Пластик", "XL", "Зеленый"));

        linkedList.add(new SuitCase("Пластик", "L", "Серый"));
        linkedList.add(new SuitCase("Ткань", "XL", "Голубой"));
        linkedList.add(new SuitCase("Ткань", "M", "Черный"));

        System.out.println("TreeSet: ");
        for (SuitCase suitCase : treeSet) {
            System.out.println(suitCase);
        }

        System.out.println("LinkedList: ");
        for (SuitCase suitCase : linkedList) {
            System.out.println(suitCase);
        }
    }
}
