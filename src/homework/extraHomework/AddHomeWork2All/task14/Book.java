package homework.extraHomework.AddHomeWork2All.task14;
//Найти ошибку в коде.
//Исправить и запустить программу.
//Менять можно только класс Book.
//
//class Book {
//
//    String title
//
//    Book(String bookTitle) {
//        this.title = newTitle
//    }
//
//    String getTitle() {
//        return this.title;
//    }
//
//}
//
//class bookVar1.BookDemo {
//
//    public static void main(String[] args) {
//        Book myBook = new Book("Principles");
//        String bookTitle = myBook.getTitle();
//        System.out.println("Book title = " + bookTitle);
//    }
//
//}

public class Book {
   String title;

    public Book(String title) {
        this.title = title;
    }


    public void setTitle(String title) {
        this.title = title;
    }

}
