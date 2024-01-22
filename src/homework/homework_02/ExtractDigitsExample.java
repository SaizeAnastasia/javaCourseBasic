package homework.homework_02;

public class ExtractDigitsExample {
    public static void main(String[] args) {
        // Произвольное трехзначное число
        int number = 575;

        // Используем математические операции для извлечения цифр
        int digitHundreds = number / 100;          // Извлекаем сотни
        int digitTens = (number % 100) / 10;       // Извлекаем десятки
        int digitOnes = number % 10;               // Извлекаем единицы

        // Выводим значения переменных в консоль
        System.out.println("Число " + number + " -> " + digitHundreds + ", " + digitTens + ", " + digitOnes);
    }
}
