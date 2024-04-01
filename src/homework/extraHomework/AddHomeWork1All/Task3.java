package homework.extraHomework.AddHomeWork1All;

//Напишите программу, которая запрашивает у пользователя целое число
//и печатает на консоль таблицу умножения для этого числа до 10.
//
//Test Data:
//Input a number: 8
//
//Expected Output :
//8 x 1 = 8
//8 x 2 = 16
//8 x 3 = 24
//...
//8 x 10 = 80

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите число для таблицы умножения :");
        int num = scanner.nextInt();
        System.out.println(" Вы ввели число " + num);

        for (int i = 1; i <= 10; i++) {
            int result = num * i;

            System.out.println(num + " * " + i + " = " + result);

        }


    }
}
