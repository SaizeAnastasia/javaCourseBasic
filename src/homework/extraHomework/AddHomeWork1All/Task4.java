package homework.extraHomework.AddHomeWork1All;
//Напишите программу, которая запрашивает у пользователя
//радиус круга (вещественное число) и печатает на консоль
//периметр и площадь круга.
//
//Test Data:
//Radius = 7.5
//
//Expected Output
//Perimeter is = 47.12388980384689
//Area is = 176.71458676442586

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Введите пожалуйста радиус круга: ");
        double radius = scanner.nextDouble();

        System.out.println(" Вы ввели: ");

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("Радиус круга равен: " + radius);
        System.out.println(" Периметр круга равен " + perimeter);
        System.out.println(" Площадь круга равна " + area);


    }
}
