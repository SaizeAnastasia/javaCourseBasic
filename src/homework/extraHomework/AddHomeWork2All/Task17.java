package homework.extraHomework.AddHomeWork2All;
//Найти ошибку в коде.
//Исправить и запустить программу.

public class Task17 {
    String ownerFirstName;
    String ownerLastName;
    int moneyAmount;

    public Task17(String ownerFirstName, String ownerLastName, int moneyAmount) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = moneyAmount;
    }




    int getMoneyAmount() {
        return this.moneyAmount;
    }

    public String getOwnerFirstName() {
        return ownerFirstName;
    }

    public String getOwnerLastName() {
        return ownerLastName;
    }
}

class BankAccountDemo {

    public static void main(String[] args) {
        Task17 bankAccount = new Task17("Viktor", "Savonin", 100000);
        String ownerFirstName = bankAccount.getOwnerFirstName();
        String ownerLastName = bankAccount.getOwnerLastName();
        int moneyAmount = bankAccount.getMoneyAmount();
        System.out.println("Owner first name = " + ownerFirstName);
        System.out.println("Owner last name = " + ownerLastName);
        System.out.println("Money amount = " + moneyAmount);
    }

}

