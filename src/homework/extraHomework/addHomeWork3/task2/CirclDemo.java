package homework.extraHomework.addHomeWork3.task2;

public class CirclDemo {
    public static void main(String[] args) {
        Circle1 circle = new Circle1();

        circle.getRadius();
        System.out.println(" Радиус круга равен " + circle.getRadius());
        circle.calculateArea(circle.getRadius());
        System.out.println(" Площадь круга равна " + circle.calculateArea(circle.getRadius()));

    }
}
