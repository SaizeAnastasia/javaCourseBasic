package homework.homework_21.inheritance.task1;

public class Car extends Vehicle {
    private int NumOfDoors;


    public Car(String producer, int age) {
        super(producer, age);
    }

    public int getNumOfDoors() {
        return NumOfDoors;
    }

    public void setNumOfDoors(int numOfDoors) {
        NumOfDoors = numOfDoors;
    }

    @Override
    public void move() {
        System.out.println(" Машина движется ");
    }
}
