package homework_40;
//1) Фильтрация списка студентов по возрасту и со средним баллом больше 4.5
//   Student {
//   String name;
//   int age;
//   double avgGrade;
//   }



import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        // Создаем список студентов
        List<StudentTask1> students = new ArrayList<>();
        students.add(new StudentTask1("Alice", 20, 4.7));
        students.add(new StudentTask1("Bob", 22, 4.2));
        students.add(new StudentTask1("Charlie", 21, 4.9));
        students.add(new StudentTask1("David", 19, 4.3));

        // Фильтрация списка студентов по возрасту и среднему баллу больше 4.5
        List<StudentTask1> filteredStudents = students.stream()
                .filter(student -> student.getAge() >= 20 && student.getAvgGrade() > 4.5)
                .collect(Collectors.toList());

        // Вывод отфильтрованного списка студентов
        System.out.println("Студенты старше 20 лет с средним баллом больше 4.5:");
        for (StudentTask1 student : filteredStudents) {
            System.out.println(student.getName() + ", возраст: " + student.getAge() + ", средний балл: " + student.getAvgGrade());
        }
    }
}

