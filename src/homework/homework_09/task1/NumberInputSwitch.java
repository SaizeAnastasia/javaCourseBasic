package homework.homework_09.task1;


//Перепишите решение задачи с использованием switch вместо if-else

import java.util.Scanner;

public class NumberInputSwitch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число 1, 2 или 3 :");
        int userInput = scanner.nextInt();

        switch (userInput) {

            case 1:
                System.out.println("Вы ввели число 1");
                break;

            case 2:
                System.out.println("Вы ввели число 2");
                break;

            case 3:
                System.out.println("Вы ввели число 3");
                break;

            default:
                System.out.println("Вы ввели неверное число");
        }

        scanner.close();

    }
}
