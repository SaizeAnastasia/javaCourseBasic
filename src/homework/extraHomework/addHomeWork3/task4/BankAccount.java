package homework.extraHomework.addHomeWork3.task4;
//Найти логическую ошибку в коде.
//Исправить и запустить программу так, что бы она выводила
//на консоль владельца банковского счёта и количество денег.

public class BankAccount {
    String owner= "Иванов";
    int money = 100;



    public BankAccount(String owner, int money) {
        this.owner = owner;
        this.money = money;
    }

    String getOwner() {
        return this.owner;
    }

    String showTheNameOfTheAccountOwner() {
        return getOwner();
    }

    int accountBalance(){
        return money;
    }

}


