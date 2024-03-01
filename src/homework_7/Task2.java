package homework_7;
//Введите 2 слова, используйте сканер.
//Получить слово, состоящее из первой половины первого слова и второй половины второго слова.
//Если количество букв в слове - нечетное, то среднюю букву в слове не учитывать.
//Распечатать на консоль.

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите первое слово: ");
        String firstWord = scanner.next();

        System.out.println(" Введите второе слово: ");
        String secondWord = scanner.next();

        int firstHalfLength = (firstWord.length() + 1) / 2;
        int secondHalfLength = secondWord.length() / 2;

        String combinedWord = firstWord.substring(0, firstHalfLength) +
                secondWord.substring(secondHalfLength);

        System.out.println("Результат: " + combinedWord);

        scanner.close();
    }
}
