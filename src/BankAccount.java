import java.util.Scanner;

public class BankAccount {
    static String accountName;
    static double balance;
    public BankAccount(String accountName, double balance) {
        this.accountName = accountName;
        this.balance = balance;

    }
    static void deposit(double amount) {
        if (amount > 0 ) {
            balance += amount;
            System.out.println("Deposited" + amount + " $. New balance: " + balance +  " $");
        } else {
            System.out.println("Amount must be higher than 0!");
        }

    }
    static void withdraw(double amount) {
        if (amount <= 0 ) {
            System.out.println("Amount must be higher than 0!");
            return;
        }
        if (amount > balance) {
            System.out.println("Invalid input. Not enough money in account");
            return;
        }

        balance -= amount;
        System.out.println("Withdrew" + amount + " $. New balance: " + balance + " $");

    }

    static void printBalance() {
        System.out.println("Current balance is " + balance + " $");
    }
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean continueLoop = true;
        while (continueLoop) {
            System.out.println("Hello and Welcome to Not-Danish Bank! Choose option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. See balance");
            System.out.println("4. Exit");

            String choice = input.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("How much do you want to deposit?");
                    try {
                        double amount = Double.parseDouble(input.nextLine());
                        deposit(amount);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a valid number!");
                    }
                    break;
                case "2":
                    System.out.println("How much do you want to withdraw?");
                    try {
                        double amount = Double.parseDouble(input.nextLine());
                        withdraw(amount);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a valid number!");
                    }
                case "3":
                    printBalance();
                    break;
                case "4":
                    continueLoop = false;
                    break;

                default:
                    System.out.println("Invalid choice - Choose between 1 and 3");
            }
            System.out.println();
        }

        input.close();
    }

}