package assignmentExceptionHandling;

import java.util.*;

public class Banking 
{
 public static void main(String[] args) 
 {
     Bank bank = new Bank();
     Scanner sc= new Scanner(System.in);

     bank.createAccount("12345", "Suresh", 1000);

     System.out.print("Enter account number to access: ");
     String accountNumber = sc.nextLine();
     Account account = bank.getAccount(accountNumber);
     int choice=0;
     if (account != null) 
     {
         while (choice!=4) 
         {
             System.out.println("\n1. Deposit");
             System.out.println("2. Withdraw");
             System.out.println("3. Check Balance");
             System.out.println("4. Exit");
             System.out.print("Choose an option: ");

             choice = sc.nextInt();
             switch (choice) 
             {
                 case 1:
                     System.out.print("Enter amount to deposit: ");
                     double depositAmount = sc.nextDouble();
                     account.deposit(depositAmount);
                     break;

                 case 2:
                     System.out.print("Enter amount to withdraw: ");
                     double withdrawAmount = sc.nextDouble();
                     try 
                     {
                         account.withdraw(withdrawAmount);
                     } 
                     catch (InsufficientBalanceException e) 
                     {
                         System.out.println("Error: " + e.getMessage());
                     }
                     break;

                 case 3:
                     System.out.println("Current balance: " + account.getBalance());
                     break;

                 case 4:
                     System.out.println("EXIT");
                     sc.close();

                 default:
                     System.out.println("Invalid option. Please try again.");
                     break;
             }
         }
     } 
     else 
     {
         System.out.println("Account not found.");
     }
     sc.close();
  }
}

class Bank 
{
    private Map<String, Account> accounts;
    
    public Bank() 
    {
        accounts = new HashMap<>();
    }
    
    public void createAccount(String accountNumber, String accountHolderName, double initialBalance) 
    {
        Account newAccount = new Account(accountNumber, accountHolderName, initialBalance);
        accounts.put(accountNumber, newAccount);
        System.out.println("Account created for: " + accountHolderName);
    }

    public Account getAccount(String accountNumber) 
    {
        return accounts.get(accountNumber);
    }
}


class Account 
{
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public Account(String accountNumber, String accountHolderName, double initialBalance) 
    {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public String getAccountNumber() 
    {
        return accountNumber;
    }

    public String getAccountHolderName() 
    {
        return accountHolderName;
    }

    public double getBalance() 
    {
        return balance;
    }

    public void deposit(double amount) 
    {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } 
        else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) throws InsufficientBalanceException 
    {
        if (amount > balance) 
        {
            throw new InsufficientBalanceException("Insufficient balance. Available balance: " + balance);
        } 
        else 
        {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
}

class InsufficientBalanceException extends Exception 
{
    public InsufficientBalanceException(String message) 
    {
        super(message);
    }
}
