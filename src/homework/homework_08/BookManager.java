package homework.homework_08;

// Написать отдельные сервисные методы которые:
//- создают новую книгу только с автором и названием
//- создают новую книгу с использованием всех параметров
//- редактирует книгу добавляя: номер каталога, количество страниц и где книга находится
//- который вывод подробно информацию о книге

public class BookManager {

        public Book createBook(String author, String title){
            return new Book(author, title);
        }


        public Book createBookWithAllInformation(String author, String title, int numberOfPage, int numberInTheCatalogue, boolean inTheBookRepository){
            return new Book(author, title, numberOfPage, numberInTheCatalogue, inTheBookRepository);
        }

        public void editBook(Book book, int numberOfPage, int numberInTheCatalogue, boolean inTheBookRepository){
            book.setNumberOfPage(numberOfPage);
            book.setNumberInTheCatalogue(numberInTheCatalogue);
            book.setInTheBookRepository(inTheBookRepository);

        }


        public void displayInformation(Book book){
            System.out.println("Author:" + book.getAuthor());
            System.out.println("Title:" + book.getTitle());
            System.out.println("Number of Page:" + book.getNumberOfPage());
            System.out.println("Number in the Catalogue:" + book.getNumberInTheCatalogue());
            System.out.println("In the Book Repository:" + book.isInTheBookRepository());
        }
    }

