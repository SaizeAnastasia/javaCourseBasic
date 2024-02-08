package homework.homework_11;

//3. Используйте цикл, чтобы просуммировать все числа, которые ввел пользователь, до первого отрицательного.

import java.util.Scanner;


public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true){
            System.out.println(" Введите число ");
            System.out.println(" Для завершения введите отрицательное число ");

            int num = scanner.nextInt();

            if (num < 0) {
                break;
            }
             sum += num;
        }

        System.out.println(" Сумма введенных чисел до первого отрицательного: " + sum);
    }
}
