package homework.extraHomework.AddHomeWork1;

//Напишите программу, которая запрашивает у пользователя
//три целых числа и выводит их среднее арифметическое
//(складывает все числа и делит на их количество).
//
//Примечение: обратите внимание, что результат может быть дробным числом.

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Введите три целых числа: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        System.out.println(" Вы ввели: " + num1 + ", " + num2 + ", " + num3 + ", ");

        int sum = num1 + num2 + num3;
        int quantityOfNum = 3;
        double arithmeticMean = sum / quantityOfNum;

        System.out.println(" Среднее арифметическое равно: " + arithmeticMean);
    }
}
