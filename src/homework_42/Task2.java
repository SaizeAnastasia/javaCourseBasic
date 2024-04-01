package homework_42;
//2. **Задача "Обработка пользовательского ввода"**:
//Создайте программу, которая запрашивает у пользователя возраст.
//Программа должна анализировать введённые данные и проверять,
//что возраст является положительным целым числом.
//Используйте блок try-catch для перехвата исключения `InputMismatchException`,
//которое может возникнуть, если пользователь вводит не числовые данные.
//В случае возникновения исключения, программа должна выводить сообщение о том,
//что введены некорректные данные и предлагать пользователю ввести данные заново.

import java.util.InputMismatchException;
import java.util.Scanner;
public class Task2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int age = 0;
            boolean isValidInput = false;

            while (!isValidInput) {
                try {
                    System.out.print("Введите возраст: ");
                    age = scanner.nextInt();

                    if (age <= 0) {
                        System.out.println("Ошибка: Возраст должен быть положительным числом!");
                    } else {
                        isValidInput = true;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: Введены некорректные данные! Попробуйте еще раз.");
                    scanner.next(); // Очистка буфера ввода
                }
            }

            System.out.println("Возраст: " + age);
        }
    }


