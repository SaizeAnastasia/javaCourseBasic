package homework_41;
//Задача 2: Группировка элементов и подсчёт количества
//
//Задание: Дан список объектов сотрудников (Employee),
//где каждый объект содержит имя и отдел, в котором работает сотрудник.
//Необходимо сгруппировать сотрудников по отделам и подсчитать
//количество сотрудников в каждом отделе.

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task2 {
        public static void main(String[] args) {
            // Создаем список объектов Employee
            List<EmployeeTask2> employees = Arrays.asList(
                    new EmployeeTask2("Alice", "HR"),
                    new EmployeeTask2("Bob", "IT"),
                    new EmployeeTask2("Charlie", "HR"),
                    new EmployeeTask2("David", "IT"),
                    new EmployeeTask2("Emily", "Finance"),
                    new EmployeeTask2("Frank", "IT"),
                    new EmployeeTask2("Grace", "HR")
            );

            // Группировка сотрудников по отделам и подсчет количества сотрудников в каждом отделе
            Map<String, Long> departmentCounts = employees.stream()
                    .collect(Collectors.groupingBy(EmployeeTask2::getDepartment, Collectors.counting()));

            // Вывод результатов
            System.out.println("Количество сотрудников в каждом отделе:");
            departmentCounts.forEach((department, count) ->
                    System.out.println(department + ": " + count));
        }
}
