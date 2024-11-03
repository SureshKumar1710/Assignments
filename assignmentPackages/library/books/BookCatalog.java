package library.books;

import java.util.*;

public class BookCatalog 
{
    private List<Books> books;

    public BookCatalog() 
    {
        this.books = new ArrayList<>();
    }

    public void addBook(Books book) 
    {
        books.add(book);
    }

    public void displayBooks() 
    {
        for (Books book : books) 
        {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getIsbn());
        }
    }
    public Books findBookByIsbn(String isbn) 
    {
        for (Books book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null; 
    }
}
