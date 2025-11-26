public class Account {

    private int accountNumber;
    private String ownerName;
    private double balance;

    public Account(int accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void displayAccountInfo() {
        System.out.println("Hi " + ownerName + "! Your account number is " + accountNumber + " and you have $" + balance);
    }

    public void deposit(double depositValue) {
        balance = balance + depositValue;
    }

    public void withdraw(double withdrawValue) {
        if (withdrawValue == 0) {
            System.out.println("Withdrawal amount must be greater than 0.");
        } else if (withdrawValue > balance) {
            System.out.println("You cannot withdraw more than you currently have");
        } else if (withdrawValue > 300) {
            System.out.println("Withdrawals over $300 are not permitted.");
        } else {
            balance = balance - withdrawValue;
        }
    }
}
