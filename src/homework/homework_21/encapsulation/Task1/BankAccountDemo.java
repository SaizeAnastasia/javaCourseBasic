package homework.homework_21.encapsulation.Task1;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);
        System.out.println(" Баланс счета :" + account.getBalance());
        account.deposit(10);
        account.withdraw(40);
        System.out.println(" Остаток на счете " + account.getBalance());
    }
}
