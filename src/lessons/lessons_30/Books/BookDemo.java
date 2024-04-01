package lessons.lessons_30.Books;

public class BookDemo {

    public static void main(String[] args) {
        BookCollection collection = new BookCollection();
        collection.addBook(4, "Колобок ");
        collection.addBook(1, "Золотая рыбка ");
        collection.addBook(3, "По щучьему веленью ");
        collection.addBook(2, "Репка ");

        collection.displayBooks();
    }
}
