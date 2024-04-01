package homework.extraHomework.addHomeWork3.task1;

public class Lamp {
    String color = " Красная ";
    int power = 220;
    int quantityOfLamps = 1;

    public Lamp() {
        this.color = color;
        this.power = power;
        this.quantityOfLamps = quantityOfLamps;
    }


    void switchOnLamp() {
        System.out.println(" Лампа включилась ");

    }

    void switchOffLamp() {
        System.out.println(" Лампа выключилась ");
    }

    public String getColor() {
        return color;
    }

    public int getPower() {
        return power;
    }

    public int getQuantityOfLamps() {
        return quantityOfLamps;
    }
}
