package assignmentConstructors;

import java.util.*;

public class Library // qn 1
{
    private ArrayList<Book> books;
    public Library() 
    {
        books = new ArrayList<>();
    }

    public void addBook(String title, String ISBN, String author, double price, int publicationYear) 
    {
        Book newBook = new Book(title, ISBN, author, price, publicationYear);
        books.add(newBook);
    }

    public void displayBooks() 
    {
    	if(books.isEmpty())
    		System.out.println("No Books Available!");
    	else
        for (Book book : books) 
        {
            System.out.println("Title: " + book.getTitle());
            System.out.println("ISBN: " + book.getISBN());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Price: Rs. " + book.getPrice());
            System.out.println("Publication Year: " + book.getPublicationYear());
            System.out.println();
        }
        System.out.println("Total Books: " + Book.getTotalBooks());
    }
    
    public static void main(String[] args) 
    {
    	Scanner sc=new Scanner(System.in);
        Library library = new Library();
        int choice=0;
        while(choice!=3)
        {
            System.out.println("MENU");
            System.out.println("1.Add Book");
            System.out.println("2.Display Books");
            System.out.print("Your choice: ");
            choice=sc.nextInt();
            switch(choice)
            {
            case 1:
            	System.out.print("Enter Book Name: ");
            	sc.nextLine();
            	String bookName=sc.nextLine();
            	System.out.print("Enter ISBN: ");
            	String ISBN=sc.next();
            	System.out.print("Enter Author Name: ");
            	sc.nextLine();
            	String author=sc.nextLine();
            	System.out.print("Enter Book price: ");
            	double price=sc.nextDouble();
            	System.out.print("Enter publication Year: ");
            	int year=sc.nextInt();
            	System.out.println();
            	library.addBook(bookName, ISBN, author, price, year);
            	break;
            case 2:
            	System.out.println();
            	library.displayBooks();
            	System.out.println();
            	break;
            case 3:
            	System.out.println("EXIT");
            	break;
            default:
            	System.out.println("No such option");
            }
        }
        sc.close();
    }
}

