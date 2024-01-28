package homework.homework_06;

//Программа должна спрашивать как зовут пользователя,
//считывать его имя с консоли и выводить приветствие
//в виде: "Hello UserName!".

import java.util.Scanner;

public class NewQuestion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите Ваше имя" );
        String userName = scanner.nextLine();
        System.out.println("Hello" + userName + "!" );



    }
}
