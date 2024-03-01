package homework.homework_21.encapsulation.Task2;

//Задача 2: Управление учетными записями пользователей
//Создайте класс `User`, который инкапсулирует данные пользователя: логин, пароль и email.
// Обеспечьте безопасное изменение и доступ к этим полям через геттеры и сеттеры.
// Пароль должен изменяться только если старый пароль введен верно и
// новый пароль соответствует определенным требованиям безопасности.

public class User {
    private String login;
    private String password;
    private  String email;

    public User(String login, String password, String email) {
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public boolean changePassword( String oldPassword, String newPassword) {

        if (!password.equals(oldPassword)) {
            System.out.println(" Неправильный старый пароль ");
            return false;
        }


        if (!isValidPassword(newPassword)) {
            System.out.println(" Новый пароль не соответствует требованиям безопасности ");
            return false;
        }

        this.password = newPassword;
        System.out.println(" Пароль успешно изменен ");
        return true;
    }

    private boolean isValidPassword(String password) {
        return password.length() >= 8;

    }

    public String getPassword() {
        return password;
    }
}
