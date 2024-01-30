package homework.homework_08;

// Написать программу, которая:
//- оперирует объектами книга со следующими параметрами
//- автор
//- название книги
//- количество страниц
//- номер в каталоге
//- параметр который показывает книга в хранилище или на руках


public class Book {

    // Переменные класса

    public String author;
    public String title;
    public int numberOfPage;
    public int numberInTheCatalogue;
    public boolean inTheBookRepository;

    public Book(String author, String title, int numberOfPage, int numberInTheCatalogue, boolean inTheBookRepository) {
        this.author = author;
        this.title = title;
        this.numberOfPage = numberOfPage;
        this.numberInTheCatalogue = numberInTheCatalogue;
        this.inTheBookRepository = inTheBookRepository;
    }

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    // Метод для вывода информации о книге

    public void displayInformation(){
        System.out.println("Автор" + author);
        System.out.println("Книга" + title);
        System.out.println("Количество страниц" + numberOfPage);
        System.out.println("Номер в каталоге" + numberInTheCatalogue);
        System.out.println("Статус" + inTheBookRepository);
    }

    public static void main(String[] args) {

        Book book1 = new Book(" Иванов", " Осень", 115, 23, true);
        Book book2 = new Book(" Петров",  " Весна", 200,  35, false);

        book1.displayInformation();
        book2.displayInformation();


    }


    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public int getNumberInTheCatalogue() {
        return numberInTheCatalogue;
    }

    public boolean isInTheBookRepository() {
        return inTheBookRepository;
    }


    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public void setNumberInTheCatalogue(int numberInTheCatalogue) {
        this.numberInTheCatalogue = numberInTheCatalogue;
    }

    public void setInTheBookRepository(boolean inTheBookRepository) {
        this.inTheBookRepository = inTheBookRepository;
    }
}


