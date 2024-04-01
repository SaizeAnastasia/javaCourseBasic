package homework_40;
//9) Дан список объектов Order, содержащий информацию о заказах, включая идентификатор, дату, сумму и статус.
//   Необходимо сгруппировать заказы по месяцам и посчитать общую сумму заказов в каждом месяце.

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task9 {
        public static void main(String[] args) {
            // Создаем список объектов Order
            List<OrderTask9> orders = new ArrayList<>();
            orders.add(new OrderTask9(1, LocalDate.of(2023, 1, 15), 100.0, "Выполнен"));
            orders.add(new OrderTask9(2, LocalDate.of(2023, 1, 20), 150.0, "Выполнен"));
            orders.add(new OrderTask9(3, LocalDate.of(2023, 2, 5), 200.0, "Выполнен"));
            orders.add(new OrderTask9(4, LocalDate.of(2023, 2, 10), 250.0, "Выполнен"));
            orders.add(new OrderTask9(5, LocalDate.of(2023, 3, 8), 300.0, "Выполнен"));

            // Сгруппируем заказы по месяцам и посчитаем общую сумму заказов в каждом месяце
            Map<String, Double> monthlyTotal = new HashMap<>();
            for (OrderTask9 order : orders) {
                String month = order.getDate().getMonth().toString();
                double total = monthlyTotal.getOrDefault(month, 0.0);
                total += order.getAmount();
                monthlyTotal.put(month, total);
            }

            // Выводим результат
            System.out.println("Общая сумма заказов по месяцам:");
            monthlyTotal.forEach((month, total) ->
                    System.out.println(month + ": " + total));
        }
    }

