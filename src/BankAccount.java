import java.util.Scanner;

public class BankAccount {
    String name;
    int balance;
    String info;

    // Constructor
    BankAccount(String name, int balance, String info) {
        this.name = name;
        this.balance = balance;
        this.info = info;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create two BankAccount objects
        BankAccount artosAccount = new BankAccount("Arto", 23323, "This is Arto's account");
        BankAccount mathewsAccount = new BankAccount("Mathew", 1000, "Mathew's account");

        // Transfer money from Arto's account to Mathew's account
        transfer(artosAccount, 100, mathewsAccount);
    }

    // Withdraw method
    static void withdraw(BankAccount account, int amount) {
        if (account.balance >= amount) { // Check if there is enough balance
            account.balance -= amount; // Update the account balance
            System.out.println("Withdrawal successful! " + account.name + "'s current balance is " + account.balance);
        } else {
            System.out.println("Insufficient balance in " + account.name + "'s account.");
        }
    }

    // Deposit method
    static void deposit(BankAccount account, int amount) {
        account.balance += amount; // Directly update the balance
        System.out.println("Deposit successful! " + account.name + "'s current balance is " + account.balance);
    }

    // Transfer method
    static void transfer(BankAccount sender, int amount, BankAccount receiver) {
        if (sender.balance >= amount) {
            withdraw(sender, amount); // Withdraw from sender
            System.out.println("Successfully transferred, sender's balance: " + sender.balance);
            System.out.println();
            deposit(receiver, amount); // Deposit to receiver
            System.out.println("Money received! Receiver's balance: " + receiver.balance);
        } else {
            System.out.println("Transfer failed. Insufficient balance in " + sender.name + "'s account.");
        }
    }
}

