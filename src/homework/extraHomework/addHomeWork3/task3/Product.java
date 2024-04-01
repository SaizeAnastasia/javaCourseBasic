package homework.extraHomework.addHomeWork3.task3;
//Разработать класс - продукт,
//у которого должны быть следующие характеристики:
//
//Свойства:
//- Наименование (String name)
//- Стандартная цена (double regularPrice)
//- Скидка в процентах (double discount)
//
//Методы:
//1. Расчет актуальной стоимости с учетом скидки (double actualPrice())
//Вывод информации о продукте в консоль (void printInformation())1P
//2. Название продукта нужно задавать через конструктор, а стоимость и скидку через оператор ".".
//
//Класс с объявлением продукта должен называться "Product".
//Класс с демонстрацией работы должен называться "ProductDemo".

public class Product {
    private String milk;
    private double regularPrice = 10.5;
    private double discount = 2.5;

    public Product(String milk) {
        this.milk = milk;
    }


    public String getMilk() {
        return milk;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public double getDiscount() {
        return discount;
    }

    double actualPrice(){
        return getRegularPrice() - getDiscount();
    }
}
