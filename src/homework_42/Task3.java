package homework_42;
//3. **Задача "Парсинг чисел"**:
//Создайте программу, которая запрашивает у пользователя строку и пытается
//преобразовать её в целое число с помощью `Integer.parseInt()`.
//Используйте обработку исключений для перехвата `NumberFormatException`,
//если введённая строка не может быть преобразована в число, и выводите
//соответствующее сообщение.


import java.util.Scanner;
public class Task3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите строку: ");
            String input = scanner.nextLine();

            try {
                int number = Integer.parseInt(input);
                System.out.println("Целое число: " + number);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Невозможно преобразовать строку в целое число!");
            }
        }
    }

