package assignments.java.Week1.BankApp;

public class BankAccount {

    private double checkingBalance;
    private double savingsBalance;
    private double dollarAmount;
    private static int numberOfAccount = 0;
    private static double totalAmountOfMoney = 0;

    public BankAccount() {
        numberOfAccount++;
    }

    public static void amountofMoney() {
        System.out.println("Total amount in all account is: " + totalAmountOfMoney);
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

    public double getTotalAmountOfMoney(String accountType) {
        if (accountType.equals("checking")) {
            return this.checkingBalance;
        } else if (accountType.equals("saving")) {
            return this.savingsBalance;
        } else {
            return -1;
        }
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

    public double withdrawFunds(double dollarAmount, String accountType) {
        if (accountType.equals("checking") && this.checkingBalance > dollarAmount) {
            this.checkingBalance -= dollarAmount;
            return checkingBalance;
        } else if (accountType.equals("saving") && this.savingsBalance > dollarAmount) {
            this.savingsBalance -= dollarAmount;
            return dollarAmount;
        } else {
            return -1;
        }
    }
}
