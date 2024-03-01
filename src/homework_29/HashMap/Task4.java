package homework_29.HashMap;
//4. **Отслеживание оценок студентов:**
//    - Создайте `HashMap`, где ключом является имя студента, а значением - его средний балл.
//    - Добавьте данные пяти студентов.
//    - Найдите и выведите имя студента с наивысшим средним баллом.
//    - Измените средний балл одного из студентов и выведите обновленные данные.

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {
        HashMap<String, Double> studentsResults = new HashMap<>();

        studentsResults.put(" Anastasia ", 1.0);
        studentsResults.put(" Segej ", 2.3);
        studentsResults.put(" Alisa ", 1.7);
        studentsResults.put(" Philipp ", 3.1);
        studentsResults.put(" Lisa ", 5.4);

        String bestStudent = Collections.max(studentsResults.entrySet(), Map.Entry.comparingByValue()).getKey();
        double highestScore = studentsResults.get(bestStudent);
        System.out.println(" Студент с наивысшим баллом: " + bestStudent +"; " + " средний балл: " + highestScore);

        String updateStudent = " Philipp ";
        double newResult = 1.5;
        studentsResults.put(updateStudent, newResult);
        System.out.println(" Студент с измененным средним баллом: " + updateStudent + newResult);

    }
}
