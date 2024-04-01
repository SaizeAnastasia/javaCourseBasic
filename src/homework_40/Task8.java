package homework_40;
//8) Дан список объектов Person, содержащий информацию о людях, включая имя, возраст, пол и зарплату.
//   Необходимо найти среднюю зарплату всех мужчин в возрасте от 25 до 40 лет.

import java.util.Arrays;
import java.util.List;

public class Task8 {
        public static void main(String[] args) {
            // Создаем список объектов Person
            List<PersonTask8> people = Arrays.asList(
                    new PersonTask8("Alice", 28, "female", 2500),
                    new PersonTask8("Bob", 35, "male", 3500),
                    new PersonTask8("Charlie", 22, "male", 3000),
                    new PersonTask8("David", 40, "male", 4000),
                    new PersonTask8("Emily", 30, "female", 2800)
            );

            // Находим среднюю зарплату всех мужчин в возрасте от 25 до 40 лет
            double averageSalary = people.stream()
                    .filter(person -> person.getGender().equals("male") && person.getAge() >= 25 && person.getAge() <= 40)
                    .mapToInt(PersonTask8::getSalary)
                    .average()
                    .orElse(0);

            // Выводим результат
            System.out.println("Средняя зарплата всех мужчин в возрасте от 25 до 40 лет: " + averageSalary);
        }
    }

