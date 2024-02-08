package homework.homework_12;

//Напишите программу, которая запрашивает у пользователя несколько чисел
//при вводе 0 - печатает сумму всех введенных чисел и их среднее арифметическое значение

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        System.out.println(" Введите любые числа");
        System.out.println(" Для завершения введите 0 ");

        while (true) {
            System.out.println(" Введите число: ");

            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }

            sum = sum + num;
            count++;
        }
        if (count > 0) {
            double average = (double) sum / count;

            System.out.println(" Сумма введеных чисел " + sum);
            System.out.println(" Среднее арифметическое " + average);
        } else {
            System.out.println(" Вы не ввели число");
        }
    }
}
