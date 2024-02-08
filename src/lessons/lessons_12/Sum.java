package lessons.lessons_12;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        System.out.println("Введите любое число. 0 для завершения");

        while (true){
            int userInput = scanner.nextInt();
            if (userInput == 0)
                break;
            sum = sum + userInput;
            count++;

        }
        if (count > 0){
            System.out.println("Сумма введенных чисел" + sum);
            System.out.println("Среднее арифметическое чисел" + (double) sum / count);
        }
        else {
            System.out.println("Неверный ввод");
        }
    }
}
