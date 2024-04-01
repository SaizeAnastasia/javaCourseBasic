package homework.extraHomework.addHomeWork3.task1;
//Выберите два разных объекта из реального мира.
//Для каждого объекта выделите 2 - 3 самых важных
//свойства и поведения, которое с этими свойствами
//связано. Создайте для каждого объекта из реального
//мира Java класс с его описанием. Создайте так же
//Demo класс для каждого описанного вами объекта
//и продемонстрируйте работу с объектом.

public class Table {
    private String color = " белый ";
    private int quantityOfLegs = 4;
    private int quantityOfDrawers = 5;

    public Table() {
        this.color = color;
        this.quantityOfLegs = quantityOfLegs;
        this.quantityOfDrawers = quantityOfDrawers;
    }


    void openTheBox() {
        System.out.println(" Ящик открыт ");

    }

    void closeTheBox() {
        System.out.println(" Ящик закрыт ");
    }

    public String getColor() {
        return color;
    }

    public int getQuantityOfLegs() {
        return quantityOfLegs;
    }

    public int getQuantityOfDrawers() {
        return quantityOfDrawers;
    }
}
