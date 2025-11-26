public class Account {

    public double AccountBalance = 0.0;

    public void deposit(double DepositValue) {
        AccountBalance = AccountBalance + DepositValue;
    }

    public void withdraw(double WithdrawValue) {
        if (AccountBalance <= 0) {
            System.out.println("You cannot withdraw from this account you faka");
        } else if (AccountBalance - WithdrawValue < 0){
            System.out.println("You do not have enough to withdraw, brokie");
        }
    }
}
