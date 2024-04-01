package homework_36.generics;
//10) Напишите метод sortByProperty, который принимает список объектов и
//    имя поля, по которому нужно сортировать список. Используйте Generics
//    для обеспечения возможности передачи в метод списка объектов любого
//    типа и получения значения поля по имени.


import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ObjectSorter {
    public static <T> void sortByProperty(List<T> list, String propertyName) {
        Collections.sort(list, new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                try {
                    Field field = o1.getClass().getDeclaredField(propertyName);
                    field.setAccessible(true);

                    Comparable value1 = (Comparable) field.get(o1);
                    Comparable value2 = (Comparable) field.get(o2);

                    return value1.compareTo(value2);
                } catch (NoSuchFieldException | IllegalAccessException e) {
                    e.printStackTrace();
                    // Handle exception properly based on your requirements
                    return 0;
                }
            }
        });
    }
}
