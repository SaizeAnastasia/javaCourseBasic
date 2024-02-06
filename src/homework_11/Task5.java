package homework_11;

//5. Пользователь ввел число N. Подсчитайте количество четных и не четных чисел в диапазоне от 0 до N

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите любое число ");

        int n = scanner.nextInt();

        int evenNum = 0;
        int oddNum = 0;

        for (int i = 0; i <= n ; i++) {

            if (i % 2 == 0) {
                evenNum ++;
            } else {
                oddNum++;

            }

        }

        System.out.println(" Количество четных чисел: " + (evenNum - 1));
        System.out.println(" Количество нечетных чисел: " + oddNum);

    }


}
