package homework_42;
//1. **Задача "Деление чисел"**:
//Напишите программу, которая запрашивает у пользователя два числа и
//выполняет их деление. Используйте обработку исключений,
//чтобы обрабатывать случаи, когда второе число равно нулю,
//выводя соответствующее сообщение об ошибке.

import java.util.Scanner;

public class Task1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите первое число: ");
            double num1 = scanner.nextDouble();

            System.out.print("Введите второе число: ");
            double num2 = scanner.nextDouble();

            try {
                double result = divideNumbers(num1, num2);
                System.out.println("Результат деления: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Ошибка: деление на ноль!");
            }
        }

        public static double divideNumbers(double num1, double num2) {
            if (num2 == 0) {
                throw new ArithmeticException("Деление на ноль невозможно!");
            }
            return num1 / num2;
        }
    }


