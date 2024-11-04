package assignmentInheritance.libraryManagement;

import java.util.List;

public class Librarian 
{
    private String name;
    private int id;
    private String password;
    private List<Book> managedBooks;
    private LibraryDatabase libraryDatabase;

    public Librarian(String name, int id, String password, LibraryDatabase libraryDatabase) 
    {
        this.name = name;
        this.id = id;
        this.password = password;
        this.libraryDatabase = libraryDatabase;
    }

    public boolean verifyLibrarian() 
    {
        return true;
    }

    public Book searchBook(String searchString) 
    {
        for (Book book : managedBooks) 
        {
            if (book.getTitle().equalsIgnoreCase(searchString)) {
                return book;
            }
        }
        return null;
    }

    public String getName() 
    {
        return name;
    }

    public int getId() 
    {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public List<Book> getManagedBooks() {
        return managedBooks;
    }

    public void setManagedBooks(List<Book> managedBooks) {
        this.managedBooks = managedBooks;
    }
}
