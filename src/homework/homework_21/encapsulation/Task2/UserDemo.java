package homework.homework_21.encapsulation.Task2;

public class UserDemo {
    public static void main(String[] args) {
        User user = new User("programist", "12345678", "kuku@mumu.com");
        System.out.println(" Старый пароль " + user.getPassword());
        user.changePassword("12345678", "87654321");
        user.changePassword("46573829", "87654321");
        user.changePassword("12345678", "87654321");
        System.out.println(" Новый пароль " + user.getPassword());
    }
}
