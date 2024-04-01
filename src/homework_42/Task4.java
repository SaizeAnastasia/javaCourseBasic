package homework_42;
//4. **Задача "Индекс вне границ массива"**:
//Напишите программу, которая создаёт массив целых чисел заданного размера,
//заполненный случайными числами. Затем программа должна запрашивать у пользователя
//индекс и пытаться вывести значение элемента массива по этому индексу.
//Используйте обработку исключений для перехвата `ArrayIndexOutOfBoundsException`,
//если указанный индекс выходит за пределы массива.


import java.util.Random;
import java.util.Scanner;
public class Task4 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();

            // Создаем массив заданного размера и заполняем случайными числами
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt(100); // случайное число от 0 до 99
            }

            // Запрашиваем у пользователя индекс
            System.out.print("Введите индекс: ");
            int index = scanner.nextInt();

            // Пытаемся вывести значение элемента массива по указанному индексу
            try {
                int value = array[index];
                System.out.println("Значение элемента массива по индексу " + index + ": " + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Ошибка: Индекс выходит за пределы массива!");
            }
        }
    }


