package homework.homework_08;

public class BookManagerDemo {

    public static void main(String[] args) {


        BookManager bookManager = new BookManager();

        Book book3 = bookManager.createBook("Зайцев ", "Бедные зайцы");



        Book book4 = bookManager.createBookWithAllInformation("Мышкин ", "Мышки в поле", 26, 13,false);


        System.out.println("Информация о книге 3: ");
        bookManager.displayInformation(book3);

        System.out.println("Информация о книге 4: ");
        bookManager.displayInformation(book4);


        bookManager.editBook(book3, 45, 56, false);


        System.out.println("Обновление информации о книге 3: ");
        bookManager.displayInformation(book3);

    }
}
