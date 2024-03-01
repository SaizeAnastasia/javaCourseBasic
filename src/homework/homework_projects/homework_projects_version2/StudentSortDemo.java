package homework.homework_projects.homework_projects_version2;

public class StudentSortDemo {
    public static void main(String[] args) {
        Student[] students = StudentService.createStudentsArrayFromUserInput();
        StudentService.fillStudentsArrayFromUserInput(students);
        StudentService.sortStudents(students);
        StudentService.printStudents(students);
    }
}
