package homework_11;

//1. Подсчитать сумму всех четных чисел от 0 до N
//при том что N вводится пользователем


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите номер: ");

        int num = scanner.nextInt();

        int sum = 0;

        for (int i = 0; i <= num; i+=2) {
            sum += i;

        }
        System.out.println(" Сумма четных чисел от 0 до " + num + " равна " + sum);
    }
}
