import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        int choice;
        int subChoice;
        Random random = new Random();
        int randomCheckingNumber = random.nextInt(1000);
        int randomSavingsNumber = random.nextInt(1000);

        System.out.println("What is your name?");
        String name = scanner.nextLine();
        Checking checkingAccount = new Checking(randomCheckingNumber, name, 0);
        Savings savingsAccount = new Savings(randomSavingsNumber, name, 0);
        System.out.println("Welcome to First Bank of Java, " + name + "! How can we help you today?");
        do {
            System.out.println("Checking Account");
            System.out.println("Savings Account");
            System.out.println("Exit");

            choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    checkingAccount.displayAccountInfo();
                    System.out.println("What would you like to do?");
                    do {
                        System.out.println("Make a deposit");
                        System.out.println("Make a withdrawal");
                        System.out.println("What is my checking account number?");
                        System.out.println("Return to main menu");

                        subChoice = scanner.nextInt();

                        switch (subChoice) {
                            case 1:
                                System.out.println("Enter deposit amount: ");
                                double depositAmount = scanner.nextDouble();
                                checkingAccount.deposit(depositAmount);
                                System.out.println("Your checking account currently has $" + checkingAccount.balance + ".");
                                break;
                            case 2:
                                System.out.println("Enter withdrawal amount: ");
                                double withdrawalAmount = scanner.nextDouble();
                                checkingAccount.withdraw(withdrawalAmount);
                                System.out.println("Your checking account currently has $" + checkingAccount.balance + ".");
                                break;
                            case 3:
                                System.out.println("Your checking account number is " + checkingAccount.accountNumber + ".");
                                break;
                            case 4:
                                System.out.println("Returning to main menu.");
                                break;
                            default:
                                System.out.println("Whoops, invalid choice! Please try again.");
                        }
                    } while (subChoice != 4);
                    break;
                case 2:
                    savingsAccount.displayAccountInfo();
                    System.out.println("What would you like to do?");
                    do {
                        System.out.println("Make a deposit");
                        System.out.println("Make a withdrawal");
                        System.out.println("What is my savings account number?");
                        System.out.println("Return to main menu");

                        subChoice = scanner.nextInt();

                        switch (subChoice) {
                            case 1:
                                System.out.println("Enter deposit amount: ");
                                double depositAmount = scanner.nextDouble();
                                savingsAccount.deposit(depositAmount);
                                System.out.println("Your savings account currently has $" + savingsAccount.balance + ".");
                                break;
                            case 2:
                                System.out.println("Enter withdrawal amount: ");
                                double withdrawalAmount = scanner.nextDouble();
                                savingsAccount.withdraw(withdrawalAmount);
                                System.out.println("Your savings account currently has $" + savingsAccount.balance + ".");
                                break;
                            case 3:
                                System.out.println("Your savings account number is " + savingsAccount.accountNumber + ".");
                                break;
                            case 4:
                                System.out.println("Returning to main menu.");
                                break;
                            default:
                                System.out.println("Whoops, invalid choice! Please try again.");
                        }
                    } while (subChoice != 4);
                    break;
                case 3:
                    System.out.println("Thank you for choosing First Bank of Java, please enjoy a complimentary Halo Top honey!");
                    break;
                default:
                    System.out.println("Whoops, invalid choice! Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}