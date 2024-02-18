package homework_projects.homework_projects_version2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StudentService {
    public static Student[] createStudentsArrayFromUserInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите количество студентов:  ");
        int size = scanner.nextInt();
        return new Student[size];
    }



    public static void fillStudentsArrayFromUserInput(Student[] students) {
      Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < students.length; i++) {
            System.out.println(" Введите данные студента : " + (i + 1) + " ");
            students[i] = createStudentFromUserInput(scanner);
        }

    }


    public static Student createStudentFromUserInput(Scanner scanner) {
        System.out.println(" Введите фамилию ");
        String firstname = scanner.next();
        System.out.println(" Введите имя ");
        String lastName = scanner.next();
        System.out.println(" Введите возраст ");
        int age = scanner.nextInt();

        return new Student(firstname, lastName, age);

    }


    public static void sortStudents(Student[] students) {
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getFirstName().compareTo(o2.getFirstName()) ;
            }
        });
    }

    public  static void printStudents(Student[] students) {
        System.out.println(" Отсортированные студенты ");
        for (Student student: students) {
            System.out.println(" Фамилия " + student.getFirstName() + " " + student.getLastName() + " " + " Возраст " + student.getAge());
        }
    }
}





