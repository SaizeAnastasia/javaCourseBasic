package homework.homework_11;

// 4. Используйте двойной цикл для генерации таблицы умножения

public class Task4 {
    public static void main(String[] args) {
        int size = 10;

        for (int i = 1; i <= size ; i++) {
            for (int j = 1; j <=size ; j++) {

                System.out.println( i * j + " ");

            }
            System.out.println();
        }
    }
}
