class BankAccount {
    String accountNumber;
    double balance;

    // Constructor to initialize account details
    BankAccount(String accNumber, double initialBalance) {
        accountNumber = accNumber;
        balance = initialBalance;
    }

    void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        // Creating a new bank account
        BankAccount account1 = new BankAccount("123456789", 1000.50);
        account1.displayBalance();
    }
}
