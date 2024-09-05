package ex_4;
class BankAccount {

    private String depositorName;
    private long accountNumber;
    private String accountType;
    private double balance;
    private static double interestRate = 4.5; 

    // Default constructor
    public BankAccount() {
        
        depositorName = "";
        accountNumber = 0;
        accountType = "Savings";
        balance = 0.0;
    }

 
    public BankAccount(String name, long accNumber, String accType, double initialBalance) {
        depositorName = name;
        accountNumber = accNumber;
        accountType = accType;
        balance = initialBalance;
    }

 
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

  
    public void withdraw(double amount) {
        double minBalance = 1000.0; 
        if (balance - amount >= minBalance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

   
    public void displayDetails() {
        System.out.println("Account Holder: " + depositorName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }

  
    public static void displayInterestRate() {
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

public class bank {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(); 
        BankAccount account2 = new BankAccount("Pranav", 123456789, "Checking", 5000.0); 

      
        account1.deposit(2000.0);
        account2.withdraw(1000.0);

       
        System.out.println("Account 1 Details:");
        account1.displayDetails();
        System.out.println();

        System.out.println("Account 2 Details:");
        account2.displayDetails();
        System.out.println();

     
        BankAccount.displayInterestRate();
    }
}
