package assignments.java.Week1.BankApp;

public class BankAccount {

    public double checkingBalance;
    public double savingsBalance;
    public double deposit;
    public static int numberOfAccount = 0;
    public static double totalAmountOfMoney = 0;

    public BankAccount() {
        numberOfAccount++;
        totalAmountOfMoney += deposit;
    }

    public static void createdAccounts() {
        System.out.println("Total number of accounts: " + numberOfAccount);
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingBalance() {
        return savingsBalance;
    }

    public static void setTotalAmountOfMoney(double inputAmount) {
        totalAmountOfMoney += inputAmount;
    }

    public double depositFunds(double dollarAmount, String accountType) {

        if (accountType.equals("checking")) {
            this.checkingBalance += dollarAmount;
            return checkingBalance;
        } else if (accountType.equals("saving")) {
            this.savingsBalance += dollarAmount;
            return savingsBalance;
        } else {
            return -1;
        }
    }
}
