package library.transactions;

import java.util.ArrayList;
import java.util.List;

public class TransactionManager 
{
    private List<Transaction> transactions;

    public TransactionManager() 
    {
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) 
    {
        transactions.add(transaction);
        transaction.displayTransaction();
    }
    
    public void displayTransactions() 
    {
        if (transactions.isEmpty()) {
            System.out.println("No transactions recorded.");
            return;
        }

        for (Transaction transaction : transactions) {
            transaction.displayTransaction();
        }
    }
}
