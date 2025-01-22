import java.util.ArrayList;

class Bank {
    private String bankName;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void openAccount(String customerName, String accountNumber, double initialBalance) {
        Customer customer = customers.stream().filter(c -> c.getName().equals(customerName)).findFirst().orElse(null);
        if (customer == null) customers.add(customer = new Customer(customerName));
        customer.addAccount(new Account(accountNumber, initialBalance));
    }

    public void displayCustomers() {
        System.out.println("Customers of " + bankName + ":");
        customers.forEach(Customer::displayAccounts);
    }
}

class Customer {
    private String name;
    private ArrayList<Account> accounts = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void displayAccounts() {
        System.out.println("Customer: " + name);
        accounts.forEach(a -> System.out.println("Account Number: " + a.getAccountNumber() + ", Balance: " + a.getBalance()));
    }
}

class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}

public class BankCustomer {
    public static void main(String[] args) {
        Bank bank = new Bank("State Bank Of India");
        bank.openAccount("Smith", "895286", 1000.00);
        bank.openAccount("Golden", "895287", 2000.00);
        bank.openAccount("John", "895288", 1500.00);
        bank.displayCustomers();
    }
}
