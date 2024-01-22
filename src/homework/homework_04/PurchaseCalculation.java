package homework.homework_04;

public class PurchaseCalculation {

public static void main(String[] args) {
    int priceA = 1000;
    int priceB = 500;


    int discount = 100;


    int totalCost = priceA + priceB - discount;


    System.out.println("Стоимость суммы A+B со скидкой: " + totalCost + " руб");


    System.out.println("Сумма скидки: " + discount + " руб");
}
}
