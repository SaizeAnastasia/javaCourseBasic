package homework.homework_21.encapsulation.Task1;


//Задача 1: Банковский счет
//Создайте класс `BankAccount`, который инкапсулирует баланс счета. Баланс не должен быть доступен для прямого изменения извне,
// а изменяться только с помощью методов `deposit` (для внесения средств) и `withdraw` (для снятия средств).


public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double value) {
        if (value > 0) {
            balance += value;
            System.out.println(" Внесено " + value + " единиц. Новый баланс  " + balance);
        } else {
            System.out.println(" Недопустимая сумма для введения ");

        }
    }

    public void withdraw(double value) {
        if (value > 0 && value <= balance) {
            balance -= value;
            System.out.println(" Cнято " + value + " единиц. Новый баланс: " + balance);
        } else {
            System.out.println(" Недостаточно средств ");

        }
    }

    public double getBalance() {
    return balance;

}

}
