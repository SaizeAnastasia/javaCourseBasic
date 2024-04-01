package homework.extraHomework.AddHomeWork1All;

//Написать консольную программу, которая запрашивает
//имя пользователя и выводит на консоль текст:
//Hello имя пользователя!

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Введите имя: ");
        String name = scanner.nextLine();
        System.out.println(" Hello " + name);
    }
}
