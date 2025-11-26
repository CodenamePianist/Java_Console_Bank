//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Have you ever been a military nurse?");

        Account account = new Account();

        System.out.println(account.AccountBalance);
        account.deposit(25.0);
        System.out.println(account.AccountBalance);
        account.withdraw(55.0);
        System.out.println(account.AccountBalance);
    }
}