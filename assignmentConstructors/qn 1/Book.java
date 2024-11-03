package assignmentConstructors;

public class Book // main function in Library class qn 1
{
    private String title;
    private String ISBN;
    private String author;
    private double price;
    private int publicationYear;
    private static int totalBooks = 0;
    
    public Book(String title, String ISBN, String author, double price, int publicationYear) 
    {
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
        this.price = price;
        this.publicationYear = publicationYear;
        totalBooks++;  
    }

    public String getTitle() 
    {
        return title;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    // Getter and setter for ISBN
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) 
    {
        this.ISBN = ISBN;
    }


    public String getAuthor() 
    {
        return author;
    }

    public void setAuthor(String author) 
    {
        this.author = author;
    }

    public double getPrice() 
    {
        return price;
    }

    public void setPrice(double price) 
    {
        this.price = price;
    }

    public int getPublicationYear() 
    {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) 
    {
        this.publicationYear = publicationYear;
    }

    public static int getTotalBooks() 
    {
        return totalBooks;
    }
}
