package homework.extraHomework.addHomeWork3.task1;

public class TableLampDemo {
    public static void main(String[] args) {
        Table table = new Table();
        Lamp lamp = new Lamp();

        System.out.println("==============Стол=============");
        table.getColor();
        System.out.println(" Мой стол имеет " + table.getColor() + " цвет ");
        table.getQuantityOfDrawers();
        System.out.println(" У него " + table.getQuantityOfDrawers() + " ящиков ");
        table.getQuantityOfLegs();
        System.out.println(" У него есть " + table.getQuantityOfLegs() + " ножки ");

        table.openTheBox();
        table.closeTheBox();
        System.out.println();

        System.out.println("===============Лампа=============");
        lamp.getColor();
        System.out.println(" У меня есть лампа. Она " + lamp.getColor());
        lamp.getPower();
        System.out.println(" Ее мощность " + lamp.getPower());
        lamp.getQuantityOfLamps();
        System.out.println(" В нее вставлено " + lamp.getQuantityOfLamps() + " лампа ");

        lamp.switchOnLamp();
        lamp.switchOffLamp();














    }
}
