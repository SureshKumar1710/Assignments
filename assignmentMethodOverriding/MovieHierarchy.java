package assignmentMethodOverriding;

class Movie 
{
    String title;
    String director;

    public Movie(String title, String director) 
    {
        this.title = title;
        this.director = director;
    }

    public void displayDetails() 
    {
        System.out.println(title + " directed by " + director + ".");
    }
}

class RomComMovie extends Movie 
{
    public RomComMovie(String title, String director) 
    {
        super(title, director);
    }

    public void displayDetails() 
    {
        System.out.println(title + " is a Romantic Comedy Movie directed by " + director + ".");
    }
}

class ComedyMovie extends Movie 
{
    public ComedyMovie(String title, String director) 
    {
        super(title, director);
    }

    public void displayDetails() 
    {
        System.out.println(title + " is a Comedy Movie directed by " + director + ".");
    }
}

class ThrillerMovie extends Movie 
{
    public ThrillerMovie(String title, String director) 
    {
        super(title, director);
    }

    public void displayDetails() 
    {
        System.out.println(title + " is a Thriller directed by " + director + ".");
    }
}

class HorrorMovie extends Movie 
{
    public HorrorMovie(String title, String director) 
    {
        super(title, director);
    }

    public void displayDetails() 
    {
        System.out.println(title + " is a Horror movie directed by " + director + ".");
    }
}

public class MovieHierarchy 
{
    public static void main(String[] args) 
    {
    	Movie romCom = new RomComMovie("The Proposal", "Anne Fletcher");
        Movie comedy = new ComedyMovie("Due Date", "Todd Phillips");
        Movie thriller = new ThrillerMovie("Inception", "Christopher Nolan");
        Movie horror = new HorrorMovie("The Conjuring", "James Wan");

        romCom.displayDetails(); 
        comedy.displayDetails(); 
        thriller.displayDetails(); 
        horror.displayDetails();
     }
}

/*
The Proposal is a Romantic Comedy Movie directed by Anne Fletcher.
Due Date is a Comedy Movie directed by Todd Phillips.
Inception is a Thriller directed by Christopher Nolan.
The Conjuring is a Horror movie directed by James Wan.
*/