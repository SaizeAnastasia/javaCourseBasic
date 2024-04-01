package homework.extraHomework.addHomeWork3.task4;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor",100);

        bankAccount.showTheNameOfTheAccountOwner();
        bankAccount.accountBalance();

        System.out.println(" Владелец " + bankAccount.showTheNameOfTheAccountOwner());
        System.out.println(" Остаток на счете " + bankAccount.accountBalance());
    }

}

