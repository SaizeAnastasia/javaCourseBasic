package homework_40;
//4) В списке студентов - выбрать тех трех кто имеет самые высокие оценки и отсортировать по году поступления

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        // Создаем список студентов
        List<StudentTask4> students = new ArrayList<>();
        students.add(new StudentTask4("Alice", 2018, 4.7));
        students.add(new StudentTask4("Bob", 2017, 4.2));
        students.add(new StudentTask4("Charlie", 2019, 4.9));
        students.add(new StudentTask4("David", 2018, 4.3));
        students.add(new StudentTask4("Emily", 2019, 4.9));

        // Выбираем трех студентов с самыми высокими оценками
        List<StudentTask4> topStudents = students.stream()
                .sorted(Comparator.comparingDouble(StudentTask4::getAvgGrade).reversed())
                .limit(3)
                .sorted(Comparator.comparingInt(StudentTask4::getYear))
                .collect(Collectors.toList());

        // Выводим результат
        System.out.println("Топ-3 студента с самыми высокими оценками, отсортированные по году поступления:");
        for (StudentTask4 student : topStudents) {
            System.out.println(student);
        }
    }
}
