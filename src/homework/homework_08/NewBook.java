package homework.homework_08;

// Нужно уметь создавать новые книги двумя способами:
//- либо указывать только автора и название книги
//  в этом случае недостающе при создании книги данные добавляются отдельно
//- либо полностью все параметры

import java.util.Scanner;

public class NewBook {

    public static void main(String[] args) {

        Book bookPartInformation = new Book("Сидоров " , "Зима");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество страниц:");
        int page = scanner.nextInt();
        bookPartInformation.numberOfPage = page;

        System.out.println("Введите номер в каталоге:");
        int number = scanner.nextInt();
        bookPartInformation.numberInTheCatalogue = number;

        System.out.println("Книга в хранилище:");
        boolean inRepository = scanner.nextBoolean();
        bookPartInformation.inTheBookRepository = inRepository;

        bookPartInformation.displayInformation();
    }

}

