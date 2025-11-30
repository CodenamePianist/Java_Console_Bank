public class Savings extends Account{
    public Savings(int accountNumber, String ownerName, double balance) {
        super(accountNumber, ownerName, balance);
    }

    public void withdraw(double withdrawValue) {
        if (withdrawValue == 0) {
            System.out.println("Withdrawal amount must be greater than 0.");
        } else if (withdrawValue > balance) {
            System.out.println("You cannot withdraw more than you currently have.");
        } else if (withdrawValue > 300) {
            System.out.println("Withdrawals over $300 are not permitted.");
        } else {
            balance = balance - withdrawValue;
        }
    }
}
