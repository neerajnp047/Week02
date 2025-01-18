class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("\nDeposited: $%.2f%n", amount);
        } else {
            System.out.println("\nInvalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("\nWithdrawn: $%.2f%n", amount);
        } else if (amount > balance) {
            System.out.println("\nInsufficient balance!");
        } else {
            System.out.println("\nInvalid withdrawal amount!");
        }
    }

    public void displayAccountDetails() {
        System.out.println("\n===========================");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.printf("Balance: $%.2f%n", balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
        System.out.printf("\nInterest Added: $%.2f at %.2f%% rate%n", interest, interestRate);
    }

    public void displaySavingsAccountDetails() {
        System.out.println("\n===========================");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.printf("Balance: $%.2f%n", getBalance());
        System.out.printf("Interest Rate: %.2f%%%n", interestRate);
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("1234567890", "Alice Johnson", 1000.00);
        account.displayAccountDetails();
        account.deposit(500.00);
        account.withdraw(300.00);
        account.displayAccountDetails();

        SavingsAccount savingsAccount = new SavingsAccount("9876543210", "Sonu Sharma", 2000.00, 5.0);
        savingsAccount.displaySavingsAccountDetails();
        savingsAccount.addInterest();
        savingsAccount.displaySavingsAccountDetails();
    }
}