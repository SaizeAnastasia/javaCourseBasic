package homework_40;
//5) из списка студентов сгруппировать данные по году поступления

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task5 {
        public static void main(String[] args) {
            // Создаем список студентов
            List<StudentTask5> students = new ArrayList<>();
            students.add(new StudentTask5("Alice", 2018, 4.7));
            students.add(new StudentTask5("Bob", 2017, 4.2));
            students.add(new StudentTask5("Charlie", 2019, 4.9));
            students.add(new StudentTask5("David", 2018, 4.3));
            students.add(new StudentTask5("Emily", 2019, 4.9));

            // Группировка студентов по году поступления
            Map<Integer, List<StudentTask5>> groupedByYear = students.stream()
                    .collect(Collectors.groupingBy(StudentTask5::getYear));

            // Вывод результата
            System.out.println("Сгруппированные данные по году поступления:");
            groupedByYear.forEach((year, studentList) -> {
                System.out.println("Год поступления: " + year);
                studentList.forEach(System.out::println);
                System.out.println();
            });
        }
    }

