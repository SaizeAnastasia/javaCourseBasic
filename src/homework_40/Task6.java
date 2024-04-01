package homework_40;
//6) Дана коллекция Person - Имя, возраст, список навыков (например языки программирования)
//   Нужно найти все уникальные навыки которыми обладают люди старше 25 лет и отсортировать их

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Task6 {
        public static void main(String[] args) {
            // Создаем коллекцию Person
            List<PersonTask6> people = Arrays.asList(
                    new PersonTask6("Alice", 30, Arrays.asList("Java", "Python", "C++")),
                    new PersonTask6("Bob", 20, Arrays.asList("Python", "JavaScript")),
                    new PersonTask6("Charlie", 35, Arrays.asList("Java", "C#")),
                    new PersonTask6("David", 25, Arrays.asList("JavaScript", "Ruby")),
                    new PersonTask6("Emily", 28, Arrays.asList("Java", "Python"))
            );

            // Находим все уникальные навыки людей старше 25 лет и сортируем их
            Set<String> uniqueSkills = people.stream()
                    .filter(person -> person.getAge() > 25)
                    .flatMap(person -> person.getSkills().stream())
                    .collect(Collectors.toSet());

            // Выводим результат
            System.out.println("Уникальные навыки людей старше 25 лет, отсортированные:");
            uniqueSkills.stream()
                    .sorted()
                    .forEach(System.out::println);
        }
    }

