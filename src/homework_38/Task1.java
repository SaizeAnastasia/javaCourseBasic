package homework_38;
//1. Напишите функциональный интерфейс для преобразования строки в верхний регистр.
//
//2. Напишите функциональный интерфейс для вычисления суммы двух целых чисел.
//
//3. Напишите функциональный интерфейс для проверки, является ли строка палиндромом.
//
//4. Напишите функциональный интерфейс для вычисления факториала числа.
//
//5. Напишите функциональный интерфейс для проверки, является ли число простым.
//
//6. Напишите функциональный интерфейс для объединения двух списков в один

import java.util.List;

public interface Task1 {


        //  1) GПреобразование строки в верхний регистр:
        interface StringToUpper{
            String convert(String string);
        }

        // 2) Вычисление суммы двух целых чисел

        interface SumCalculator{
            int calculate( int a, int b);

        }

        // 3) Проверка, является ли строка палиндромом


        interface PalindromeChecker {
            boolean isPalindrome(String string);
        }



        // 4) Вычисление факториала числа
        interface FactorialCalculator {
            int calculate(int n);
        }


        // Проверка является ли число простым

        interface PrimeChecker {
            boolean isPrime(int n);
        }


        // Объединение списков в один

        interface ListMerger<T> {
            List<T> merge(List<T> list1, List<T> list2);
        }


    }


