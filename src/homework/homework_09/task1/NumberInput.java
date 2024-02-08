package homework.homework_09.task1;

//Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор: 1, 2 или 3,
//а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3

import java.util.Scanner;

public class NumberInput {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите число 1, 2, 3,");

        if (scanner.hasNextInt()) {
            int numberInput = scanner.nextInt();

            if (numberInput == 1 || numberInput == 2 || numberInput == 3) {
                System.out.println("Введенное число:" + numberInput);
            } else {
                System.out.println("Введено неверное число. Введите 1, 2 или 3");

            }

        } else {

            System.out.println("Ошибка ввода. Введите целое число");
        }

        scanner.close();
    }
}
