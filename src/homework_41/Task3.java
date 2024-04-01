package homework_41;
//Задача 3: Преобразование списка объектов и агрегация
//
//Задание: Дан список объектов заказов (Order), где каждый заказ
//содержит список покупок (List<Purchase>) и дату заказа.
//Каждая покупка содержит название товара и его стоимость.
//Необходимо рассчитать общую сумму стоимости всех покупок,
//сделанных в текущем месяце.

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Task3 {
        public static void main(String[] args) {
            // Создаем список объектов Order
            List<OrderTask3> orders = new ArrayList<>();
            orders.add(new OrderTask3(LocalDate.of(2024, 3, 5),
                    List.of(new PurchaseTask3("Apple", 2.5), new PurchaseTask3("Banana", 1.5))));
            orders.add(new OrderTask3(LocalDate.of(2024, 3, 10),
                    List.of(new PurchaseTask3("Orange", 3.0), new PurchaseTask3("Grapes", 4.0))));
            orders.add(new OrderTask3(LocalDate.of(2024, 2, 15),
                    List.of(new PurchaseTask3("Milk", 2.0), new PurchaseTask3("Bread", 1.0))));

            // Получаем текущую дату
            LocalDate currentDate = LocalDate.now();

            // Рассчитываем общую сумму стоимости всех покупок, сделанных в текущем месяце
            double totalCost = orders.stream()
                    .filter(order -> order.getDate().getMonth().equals(currentDate.getMonth()))
                    .flatMap(order -> order.getPurchases().stream())
                    .mapToDouble(PurchaseTask3::getPrice)
                    .sum();

            // Выводим результат
            System.out.println("Общая сумма стоимости всех покупок, сделанных в текущем месяце: " + totalCost);
        }
    }

