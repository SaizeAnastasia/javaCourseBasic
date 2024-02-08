package lessons.lessons_12;

import lessons.lessons_06.scanner.UserInput;

import java.util.Scanner;

public class Lift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInput userInput = new UserInput();
        System.out.println("Количество этажей подъема");
        int up = scanner.nextInt();
        System.out.println("Количество этажей спуска");
        int down = scanner.nextInt();


        int allFloors = userInput.inputInteger("Введите количество этажей");
        int currentFloor = 0;

        int iterations = 0;


        while (currentFloor < allFloors) {
            iterations++;
                    currentFloor += allFloors;
        }


        System.out.println("Лифт достиг крыши за " + iterations + "итераций ");
    }

}
