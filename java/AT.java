import java.util.Scanner;

public class AT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 1000; // initial account balance

        System.out.println("Welcome to the ATM!");
        System.out.println("Please select an option:");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Exit");

        int choice = input.nextInt();

        if (choice == 1) {
            System.out.println("Your balance is $" + balance);
        } else if (choice == 2) {
            System.out.println("How much would you like to withdraw?");
            int withdrawalAmount = input.nextInt();
            if (withdrawalAmount > balance) {
                System.out.println("Insufficient funds.");
            } else {
                // balance -= withdrawalAmount;
                balance=balance-withdrawalAmount;
                System.out.println("Your new balance is $" + balance);
            }
        } else if (choice == 3) {
            System.out.println("How much would you like to deposit?");
            int depositAmount = input.nextInt();
            balance += depositAmount;
            System.out.println("Your new balance is $" + balance);
        } else if (choice == 4) {
            System.out.println("Thank you for using the ATM!");
        } else {
            System.out.println("Invalid choice.");
        }
    }
}
