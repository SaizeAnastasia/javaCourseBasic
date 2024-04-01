package homework.extraHomework.AddHomeWork2All.robot;

public class Robot {

    String name;


    public Robot(String name) {
        this.name = name;
    }


    public void sayHallo() {
        System.out.println(" hello " + this.name );
    }

    public void sayYourName() {
        System.out.println( "My name is " + this.name);
    }
}
