import java.util.Scanner;

class BankAccount {
    static String bankName = "Global Bank"; 
    static int totalAccounts = 0;
    String accountNumber;
    String accountHolderName;

    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++; 
    }

    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    public void displayDetails() {
        if (this instanceof BankAccount) { 
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder Name: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        } else {
            System.out.println("Invalid account object.");
        }
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Bank Name: ");
        BankAccount.bankName = sc.nextLine();

        while (true) {
            System.out.print("\nEnter Account Number: ");
            String accountNumber = sc.nextLine();
            System.out.print("Enter Account Holder Name: ");
            String accountHolderName = sc.nextLine();
            BankAccount account = new BankAccount(accountHolderName, accountNumber);
            account.displayDetails();
            System.out.print("\nDo you want to add another account? (yes/no): ");
            String choice = sc.nextLine().trim().toLowerCase();
            if (!choice.equals("yes")) {
                break; 
            }
        }
        BankAccount.getTotalAccounts();
        sc.close();
    }
}
