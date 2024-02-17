package homework_19;

//2. Напишите программу, которая определит, сколько слов Вы ввели с консоли.

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System. in); // Создала сканер

        System.out.println(" Введите слова. (для завершения нажмите '0' ) : ");

        int wordNumber = 0; // Переменная для подсчета количества слов
        while(true) { // цикл чтения ввода с консоли, до тех пор пока не будет введено 0
            String word = scanner.next(); // считывание слова
            if ( word.equals("0")) { // Проверка условия завершения.  Если считаное слово равно 0, то выходим из цикла с помощью break
                break;

            }
            wordNumber++; // если считаное слово не 0, то увеличиваем значение переменной wordNumber на 1

        }
        System.out.println(" Вы ввели " + wordNumber + " слов ");
        scanner.close();
    }
}
