package homework.homework_21.inheritance.task1;

public class Vehicle {
    private String producer;
    private  int age;

    public Vehicle(String producer, int age) {
        this.producer = producer;
        this.age = age;
    }


    public String getProducer() {
        return producer;
    }

    public int getAge() {
        return age;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void move() {
        System.out.println(" Транспортное средство движется ");
    }
}
