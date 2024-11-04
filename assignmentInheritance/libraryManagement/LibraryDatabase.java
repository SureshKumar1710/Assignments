package assignmentInheritance.libraryManagement;

import java.util.ArrayList;
import java.util.List;

public class LibraryDatabase {
    private List<Book> listOfBooks = new ArrayList<>();
    private List<Account> listOfAccounts = new ArrayList<>();

    public LibraryDatabase(List<Book> books) {
        this.listOfBooks = books != null ? books : new ArrayList<>();
    }

    public void addBook(Book book) 
    {
        if (book != null) 
        {
            listOfBooks.add(book);
            System.out.printf("Book added: %s%n", book.getTitle());
        } 
        else 
        {
            System.out.println("Cannot add null book.");
        }
    }

    public boolean deleteBook(Book book) 
    {
        if (book != null) 
        {
            boolean removed = listOfBooks.remove(book);
            System.out.printf("Book %s removed: %s%n", removed ? "successfully" : "not found", book.getTitle());
            return removed;
        }
        System.out.println("Cannot delete null book.");
        return false;
    }

    public void updateBook(Book oldBook, Book newBook) 
    {
        if (oldBook != null && newBook != null) 
        {
            int index = listOfBooks.indexOf(oldBook);
            if (index != -1) 
            {
                listOfBooks.set(index, newBook);
                System.out.printf("Book updated from %s to %s%n", oldBook.getTitle(), newBook.getTitle());
            } 
            else 
            {
                System.out.println("Old book not found for update.");
            }
        } 
        else 
        {
            System.out.println("Old or new book cannot be null.");
        }
    }

    public void displayBooks() 
    {
        System.out.println("List of books:");
        for (Book book : listOfBooks) 
        {
            System.out.printf("- %s by %s%n", book.getTitle(), book.getAuthor());
        }
    }

    public Book searchBook(String searchString) 
    {
        for (Book book : listOfBooks) 
        {
            if (book.getTitle().equalsIgnoreCase(searchString)) 
            {
                return book;
            }
        }
        System.out.println("Book not found: " + searchString);
        return null;
    }

    public void addAccount(Account account) 
    {
        if (account != null) 
        {
            listOfAccounts.add(account);
            System.out.printf("Account added with ID: %d%n", account.getId());
        } 
        else 
        {
            System.out.println("Cannot add null account.");
        }
    }

    public boolean deleteAccount(Account account) 
    {
        if (account != null) 
        {
            boolean removed = listOfAccounts.remove(account);
            System.out.printf("Account %s removed with ID: %d%n", removed ? "successfully" : "not found", account.getId());
            return removed;
        }
        System.out.println("Cannot delete null account.");
        return false;
    }

    public void updateAccount(Account oldAccount, Account newAccount) 
    {
        if (oldAccount != null && newAccount != null) 
        {
            int index = listOfAccounts.indexOf(oldAccount);
            if (index != -1) 
            {
                listOfAccounts.set(index, newAccount);
                System.out.printf("Account updated from ID %d to ID %d%n", oldAccount.getId(), newAccount.getId());
            } 
            else 
            {
                System.out.println("Old account not found for update.");
            }
        } 
        else 
        {
            System.out.println("Old or new account cannot be null.");
        }
    }

    public void displayAccounts() 
    {
        System.out.println("List of accounts:");
        for (Account account : listOfAccounts) 
        {
            System.out.printf("Account ID: %d, Borrowed Books: %d%n", account.getId(), account.getNoBorrowedBooks());
        }
    }

    public Account searchAccount(int accountId) 
    {
        for (Account account : listOfAccounts) 
        {
            if (account.getId() == accountId) 
            {
                return account;
            }
        }
        System.out.println("Account not found with ID: " + accountId);
        return null;
    }
}
