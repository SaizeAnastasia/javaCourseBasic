package lessons.lessons_06.scanner;

public class UserInputDemo {
    public static void main(String[] args) {
        UserInput ui = new UserInput();

        String text = ui.inputText("Введите текст: ");

        System.out.println("Вы ввели: " + text);
    }
}
