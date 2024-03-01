package homework_29.ListTasks;

//1. **Управление списком студентов:**
//    - Создайте `ArrayList` для хранения имен студентов.
//    - Добавьте в список пять имен студентов.
//    - Выведите список студентов в обратном порядке.
//    - Удалите студента из списка по индексу и выведите обновленный список.

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Task1 {
    public static void main(String[] args) {


        ArrayList<String> studentNames = new ArrayList<>();

        studentNames.add("Anastasia");
        studentNames.add("Sergej");
        studentNames.add("Alisa");
        studentNames.add("Philipp");
        studentNames.add("Elena");


        System.out.println(" Список студентов в обратном порядке ");

        Collections.reverse(studentNames);
        for (String name : studentNames){
            System.out.println(name);
        }



        System.out.println(" Обновленный список ");
        int removeIndex = 3;
        studentNames.remove(removeIndex);
        for (String name : studentNames){
            System.out.println(name);
        }




    }
}