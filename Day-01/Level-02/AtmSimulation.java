import java.util.Scanner;

class BankAccount{
    String accountHolder;
    int accountNumber;
    double balance;

    public BankAccount(String accountHolder, int accountNumber, double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void depositing(double amount){
        balance += amount;
        System.out.println("Total balance after depositing is " + balance);
    }
    public void withdraw(double amount){
        if(amount>0 && amount <= balance){
            balance -= amount;
            System.out.println("The updated balance is " + balance);
        }else{
            System.out.println("Insufficient amount or invalid amount");
        }
    
    }
    public void displayDetails(){
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance " + balance);
    }

}

public class AtmSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Holder name: ");
        String accountHolder = sc.next();
        System.out.println("Enter Account Number: ");
        int accountNumber = sc.nextInt();
        System.out.println("Enter the balance: ");
        double balance = sc.nextDouble();

        BankAccount BankAccount = new BankAccount(accountHolder, accountNumber, balance);
        BankAccount.displayDetails();
        System.out.println("Enter the amount to be deposited: ");
        double amount = sc.nextDouble();
        BankAccount.depositing(amount);
        System.out.println("Enter the amount to be withdraw: ");
         amount = sc.nextDouble();
         BankAccount.withdraw(amount);



    }
}
