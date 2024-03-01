package homework.homework_21.inheritance.task1;

public class Bicycle extends Vehicle {
    private int numberOfGears;


    public Bicycle(String producer, int age, int numberOfGears) {
        super(producer, age);
        this.numberOfGears = numberOfGears;
    }


    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }
    @Override
    public void move(){
        System.out.println(" Велосипед движется ");
    }
}
