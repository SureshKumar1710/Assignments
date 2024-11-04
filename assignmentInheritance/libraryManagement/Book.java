package assignmentInheritance.libraryManagement;

public class Book {

	private String title;
	private String author;
	private String ISBN;
	private String publication;

	public Book(String title, String author, String ISBN, String publication) 
	{
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.publication = publication;
	}

	public String getTitle() 
	{
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getISBN() {
		return ISBN;
	}

	public String getPublication() {
		return publication;
	}
	public void showDueDate() 
	{
		System.out.println("Show due date is called");
	}

	public String reservationStatus() {
		return "Reserved";
	}

	public void feedback(String feedback) 
	{
		System.out.println("feedback is called");
	}

	public void bookRequest() 
	{
		System.out.println("Book request is called");
	}

	public void renewInfo() 
	{
		System.out.println("Reneww info is called");
	}

}