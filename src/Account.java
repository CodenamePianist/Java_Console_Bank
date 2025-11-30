public abstract class Account {

    protected int accountNumber;
    protected String ownerName;
    protected double balance;

    public Account(int accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void displayAccountInfo() {
        System.out.println(ownerName + ", Your account number is " + accountNumber + " and you have $" + balance + ".");
    }

    public void deposit(double depositValue) {
        if (depositValue > 0){
            balance = balance + depositValue;
        }
    }

    public abstract void withdraw(double withdrawValue);

}
