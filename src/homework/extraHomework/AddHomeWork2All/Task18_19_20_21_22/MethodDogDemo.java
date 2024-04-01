package homework.extraHomework.AddHomeWork2All.Task18_19_20_21_22;

public class MethodDogDemo {
    public static void main(String[] args) {
        MethodDog dog = new MethodDog();

        dog.getName();
        System.out.println("Меня зовут " + dog.getName());
        dog.getAge();
        System.out.println(" Мне " + dog.getAge() + " лет ");
        dog.getColor();
        System.out.println(" Моя шерсть " + dog.getColor());

        dog.voice();
        dog.bite();
        dog.HappyBirthday();
        dog.changeColor();


    }
}
