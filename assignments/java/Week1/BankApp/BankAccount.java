package assignments.java.Week1.BankApp;

public class BankAccount {

    public double checkingBalance;
    public double savingsBalance;
    public static int numberOfAccount = 0;
    public static int totalAmountOfMoney = 0;

    public BankAccount(double checkingBalance, double savingsBalance) {

        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        numberOfAccount++;
    }

    public static void createdAccounts() {
        System.out.println("Total number of accounts: " + numberOfAccount);
    }
}
