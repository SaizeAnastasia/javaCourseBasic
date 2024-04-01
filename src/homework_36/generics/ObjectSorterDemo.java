package homework_36.generics;
//10) Напишите метод sortByProperty, который принимает список объектов и
//    имя поля, по которому нужно сортировать список. Используйте Generics
//    для обеспечения возможности передачи в метод списка объектов любого
//    типа и получения значения поля по имени.

import java.util.List;

import static homework_36.generics.ObjectSorter.sortByProperty;

public class ObjectSorterDemo {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 20)
        );

        System.out.println("Before sorting:");
        for (Person person : people) {
            System.out.println(person);
        }

        sortByProperty(people, "age");

        System.out.println("\nAfter sorting by age:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
