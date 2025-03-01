import java.util.Scanner;

class UserDetail {
    long number;
    String password;

    public UserDetail(long num, String pass) {
        number = num;
        password = pass;
    }

    public void DisplayResult() {
        if (number > 0 && password != null && !password.isEmpty()) {
            System.out.println("Screenshot the Details.....");
            System.out.println("User Number = " + number);
            System.out.println("User Password = " + password);
        } else {
            System.out.println("Please enter valid details...");
        }
    }
}

class TransactionCalculation {
    private static int current_balance = 0; // Store user's balance

    public void deposit(int amount) {
        if (amount > 0) {
            current_balance += amount;
            System.out.println("Successfully deposited $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(int amt) {
        if (amt > 0 && amt <= current_balance) {
            current_balance -= amt;
            System.out.println("Successfully withdrawn $" + amt);
        } else if (amt > current_balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void transfer(int amt) {
        if (amt > 0 && amt <= current_balance) {
            current_balance -= amt;
            System.out.println("Successfully transferred $" + amt);
        } else {
            System.out.println("Transfer failed due to insufficient balance.");
        }
    }

    public void view_balance() {
        System.out.println("Current Balance: $" + current_balance);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*************** Prabin Unlimited Bank Limited ***************");
        System.out.println("Please enter the details for further operations...");

        System.out.print("Enter Your Mobile Number: ");
        long num = sc.nextLong();
        sc.nextLine(); // Consume leftover newline

        System.out.print("Enter Your Password: ");
        String pass = sc.nextLine();

        UserDetail user = new UserDetail(num, pass);
        user.DisplayResult();

        TransactionCalculation calc = new TransactionCalculation();

        while (true) {
            System.out.println("\n*** Choose an operation ***");
            System.out.println("1. Deposit\n2. Withdraw\n3. Transfer\n4. View Balance\n5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to deposit: ");
                    int depositAmount = sc.nextInt();
                    calc.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    int withdrawAmount = sc.nextInt();
                    calc.withdraw(withdrawAmount);
                    break;

                case 3:
                    System.out.print("Enter the amount to transfer: ");
                    int transferAmount = sc.nextInt();
                    calc.transfer(transferAmount);
                    break;

                case 4:
                    calc.view_balance();
                    break;

                case 5:
                    System.out.println("Exiting the banking system...");
                    sc.close();
                    return;

                default:
                    System.out.println("Please enter a valid option.");
            }
        }
    }
}
