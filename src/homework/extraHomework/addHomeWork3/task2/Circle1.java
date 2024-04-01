package homework.extraHomework.addHomeWork3.task2;
//Разработать класс - круг, у которого должны быть следующие характеристики:
//Свойства: радиус (double radius),
//Методы: расчет площади (double calculateArea()).
//
//Класс с объявлением фигуры круг должен называться "Circle".
//Класс с демонстрацией работы должен называться "CircleDemo".

public class Circle1 {
   private double radius = 55.7;
   double calculateArea(double radius){

       return Math.PI * Math.pow(getRadius(),2);
   }

   public double getRadius() {
        return radius;
    }
}
