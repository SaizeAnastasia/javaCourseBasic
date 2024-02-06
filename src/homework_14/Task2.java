package homework_14;
// №2
//1. Создайте массив из всех нечётных чисел от 1 до 99.
//2. Выведите его на экран в строку в обратном порядке
public class Task2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <=99 ; i+=2) {
            count++;

        }

        int[] oddNumbers = new int[count];
        int index = 0;
        for (int i = 1; i <=99 ; i+=2) {
            oddNumbers[index] = i;
            index++;

        }

        System.out.println(" Массив нечетных чисел от 1 до 99 в обратном порядке: ");
        for (int i = oddNumbers.length - 1;  i >= 0; i--) {
            System.out.println(oddNumbers[i] + " ");

        }
    }
}
