package homework.homework_06.calculatorCheck;


//Реализовать программу, выводящую на экран результаты сложения,
//вычитания, умножения и деления двух чисел, введенных пользователем.
//Каждая из арифметических операций должна быть реализована как отдельный метод.
//Ввод пользователем данных реализуйте отдельным классом с соответствующим методом.


import java.util.Scanner;

public class CalculatorCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число:");
        double num1 = scanner.nextDouble();

        System.out.print(" Введите второе число:");
        double num2 = scanner.nextDouble();

        printResult( "Сумма" , num1 + num2);
        printResult( "Вычитание" , num1 - num2);
        printResult("Умножение " , num1 * num2);
        printResult("Деление " , num1 / num2);

        scanner. close();

    }

    public static void printResult(String operation, double result)  {
        System.out.println((operation + ": " + result));

    }

}


