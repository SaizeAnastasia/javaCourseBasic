package lessons.lessons_30.Books;

import java.util.TreeSet;

public class BookCollection {

    private TreeSet<Book> books;


    public BookCollection() {
        this.books = new TreeSet<>();
    }

    public void addBook(int id, String name) {
        Book book = new Book(id, name);
        books.add(book);
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println("Id : " + book.getId() + " Name : " + book.getName());

        }
    }
}
