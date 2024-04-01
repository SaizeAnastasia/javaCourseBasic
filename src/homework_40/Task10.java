package homework_40;
//10) Дан список объектов Book, содержащий информацию о книгах, включая название, автора и список тегов.
//    Необходимо получить список всех уникальных тегов

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Task10 {
        public static void main(String[] args) {
            // Создаем список объектов Book
            List<BookTask10> books = Arrays.asList(
                    new BookTask10("Java Programming", "John Smith", Arrays.asList("Programming", "Java", "Computer Science")),
                    new BookTask10("Python Basics", "Alice Johnson", Arrays.asList("Programming", "Python", "Computer Science")),
                    new BookTask10("Art of War", "Sun Tzu", Arrays.asList("Military", "Strategy")),
                    new BookTask10("Clean Code", "Robert Martin", Arrays.asList("Programming", "Software Engineering"))
            );

            // Получаем список всех уникальных тегов
            Set<String> uniqueTags = books.stream()
                    .flatMap(book -> book.getTags().stream())
                    .collect(Collectors.toSet());

            // Выводим результат
            System.out.println("Список всех уникальных тегов:");
            uniqueTags.forEach(System.out::println);
        }
    }

