package homework_34.project;
//Вариант 2. Система управления автомобильным салоном с оценками моделей
//
//Цель: Разработать систему для управления автомобилями в автосалоне, включая функцию оценки моделей.
//
//Задачи:
//
//    Создать класс Car с информацией о марке, модели, годе выпуска, цене и рейтинге автомобиля.
//    Создать класс CarDealer, который использует HashMap для хранения автомобилей, где ключом является
//    уникальный идентификатор автомобиля (например, VIN-номер), а значением - объект Car.
//    В классе CarDealer реализовать методы для добавления новых автомобилей, удаления автомобилей из списка,
//    обновления информации о конкретной машине (например, цены или рейтинга), а также поиска автомобилей
//    по различным критериям (марка, модель, год выпуска).
//    Добавить функционал для оценки автомобилей покупателями и сортировки автомобилей по рейтингу, цене или году выпуска.
//    Реализовать возможность вывода информации о всех автомобилях в наличии или автомобилях определенной марки.

public class Car {
    private String brand;
    private String model;
    private int year;
    private double price;
    private double rating;

    public Car(String brand, String model, int year, double price, double rating) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.rating = rating;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
