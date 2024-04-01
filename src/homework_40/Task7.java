package homework_40;
//7) Дана коллекция Product - название, категория, цена, количество на складе.
//   Найти среднюю цену продуктов каждой категории, у которых количество превышает заданное значение
//   и отсортировать по убыванию цены

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task7 {
    public static void main(String[] args) {
        // Создаем коллекцию Product
        List<ProductTask7> products = Arrays.asList(
                new ProductTask7("Laptop", "Electronics", 1200.0, 10),
                new ProductTask7("Smartphone", "Electronics", 800.0, 20),
                new ProductTask7("Book", "Books", 25.0, 50),
                new ProductTask7("Headphones", "Electronics", 150.0, 15),
                new ProductTask7("Chair", "Furniture", 200.0, 30),
                new ProductTask7("Tablet", "Electronics", 400.0, 25)
        );

        // Задаем значение количества для фильтрации
        int minQuantity = 20;

        // Находим среднюю цену продуктов каждой категории, у которых количество превышает minQuantity
        Map<String, Double> averagePrices = products.stream()
                .filter(product -> product.getQuantity() > minQuantity)
                .collect(Collectors.groupingBy(ProductTask7::getCategory,
                        Collectors.averagingDouble(ProductTask7::getPrice)));


        // Выводим результат
        System.out.println("Средняя цена продуктов каждой категории, у которых количество превышает " + minQuantity);

    }
}


