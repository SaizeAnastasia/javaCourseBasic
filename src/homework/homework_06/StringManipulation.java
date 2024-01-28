package homework.homework_06;
// 1 Создайте строку через new - I study Basic Java!
//2 Напишите метод, который принимает в качестве параметра строку, передайте в этот метод строку, которую создали в п.1
//3 Распечатать последний символ строки. Используем метод String.charAt().
//4 Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
//5 Заменить все символы “а” на “о”.
//6 Преобразуйте строку к верхнему регистру.
//7 Преобразуйте строку к нижнему регистру.
//8 Вырезать строку Java c помощью метода String.substring().

import java.util.Locale;

public class StringManipulation {

    public static void main(String[] args) {

        // Создаем строку. Печатаем последний символ строки

        String text = new String("I study Basic Java!");
        char lastSymbol = text.charAt(18);
        System.out.println(lastSymbol);

        // Проверяем, содержит ли строка подстроку Java

        boolean contains = text.contains("Java");
        System.out.println(contains);

        // Заменяем все символы а на о

        String newText = text. replace('a', 'o');
        System.out.println(newText);

        // Преобразуем строку к верхнему регистру

        System.out.println("Преобразовали к верхнему регистру:");
        System.out.println(text.toUpperCase());

        // Преобразуем строку к нижнему регистру

        System.out.println("Преобразовали к нижнему регистру:");
        System.out.println(text.toLowerCase());

        // Вырезаем строку Java c помощью метода String.substring().

        System.out.println("Вырезаем Java:");
        System.out.println(text.substring(0, 13));







    }

}


