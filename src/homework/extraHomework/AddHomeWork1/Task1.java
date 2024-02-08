package homework.extraHomework.AddHomeWork1;

//Написать консольную программу, которая запрашивает у пользователя два вещественных числа
//(числа с запятой) и выводит на консоль результаты: сложения, вычитания, умножения и деления.
//Вещественные числа можно запрашивать с консоли используя обьект Scanner
//следующим образом:
// Scanner scanner = new Scanner(System.in);
//    double firstDoubleNumber = scanner.nextDouble();

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите число: ");
        double num1 = scanner.nextDouble();
        System.out.println(" Вы ввели первое число " + num1);


        System.out.println( "Введите второе число :");
        double num2 = scanner.nextDouble();
        System.out.println(" вы ввели второе число " + num2);



        double sum = num1 + num2;
        double substraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;

        System.out.println(" Сумма чисел " + sum);
        System.out.println(" Вычитание чисел " + substraction);
        System.out.println(" Умножение чисел " + multiplication);
        System.out.println(" Деление чисел " + division);



    }


}
