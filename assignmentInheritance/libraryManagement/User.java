package assignmentInheritance.libraryManagement;

import java.util.List;

public class User 
{
    private String name;
    private int id;
    private Account account;
    private List<Book> borrowedBooks;

    public User(String name, int id) 
    {
        this.name = name;
        this.id = id;
        this.account = new Account(id, 0, 0, 0, 0, 0.0);
    }

    public boolean verify() 
    {
        return true;
    }

    public Account checkAccount() {
        return account;
    }

    public Book getBookInfo(String title) 
    {
        for (Book book : borrowedBooks) 
        {
            if (book.getTitle().equalsIgnoreCase(title)) 
            {
                return book;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) 
    {
        this.borrowedBooks = borrowedBooks;
    }
}
