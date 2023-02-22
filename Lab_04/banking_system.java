package Lab_04;
//Importing the array
import java.util.ArrayList;
//Importing the Scanner Class
import java.util.Scanner; 
//Importing the LocalDateTime class
import java.time.LocalDateTime;

public class banking_system{ // Creating the class Banking_system
    private int accountNumber; //Creating the global variables account_Number,account_HolderName,Account_Balance
    private String accountHolderName;
    private double accountBalance;
    private ArrayList<String> transactions;

public banking_system(int accountNumber, String accountHolderName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
        this.transactions = new ArrayList<>();
        this.transactions.add("Account created with initial balance: " + accountBalance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            transactions.add("Deposit of " + amount + " made. New balance is " + accountBalance);
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            transactions.add("Withdrawal of " + amount + " made. New balance is " + accountBalance);
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void printTransactions() {
        System.out.println("Transaction history:");
        for (String transaction : transactions) {
            System.out.println(transaction);
            LocalDateTime myObj = LocalDateTime.now();
        System.out.println(myObj);
        }
    }

    public void printAccountSummary() {
        System.out.println("Account summary:");
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account holder name: " + accountHolderName);
        System.out.println("Account balance: " + accountBalance);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Initialize customer
            System.out.println("Enter account number:");
            int accountNumber = scanner.nextInt();
            scanner.nextLine(); // consume newline character
            System.out.println("Enter account holder name:");
            String accountHolderName = scanner.nextLine();
            System.out.println("Enter initial account balance:");
            double accountBalance = scanner.nextDouble();
            banking_system bankAccount = new banking_system(accountNumber, accountHolderName, accountBalance);

            // Display menu
            int choice;
            do {
                System.out.println();
                System.out.println("1. Deposit money");
                System.out.println("2. Withdraw money");
                System.out.println("3. Print transaction history");
                System.out.println("4. Print account summary");
                System.out.println("5. Exit");
                System.out.println("Enter your choice:");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter deposit amount:");
                        double depositAmount = scanner.nextDouble();
                        bankAccount.deposit(depositAmount);
                        break;
                    case 2:
                        System.out.println("Enter withdrawal amount:");
                        double withdrawalAmount = scanner.nextDouble();
                        bankAccount.withdraw(withdrawalAmount);
                        break;
                    case 3:
                        bankAccount.printTransactions();
                        break;
                    case 4:
                        bankAccount.printAccountSummary();
                        break;
                    case 5:
                        System.out.println("Exiting program.");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            } while (choice != 5);
        }
    }
}