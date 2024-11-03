package assignmentsAbstarctClassesAndObject;

abstract class Movie 
{
    protected String title;
    protected String director;
    protected int releaseYear;

    public Movie(String title, String director, int releaseYear) 
    {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
    }

    public String getBasicDetails() 
    {
        return "Title: " + title + ", Director: " + director + ", Release Year: " + releaseYear;
    }

    public abstract String getGenre();
    public abstract double getDuration();
    public abstract String getAdditionalInfo();
    public abstract void displayDetails();
}

class RomComMovie extends Movie 
{
    private double duration;
    private String leadActor;
    public RomComMovie(String title, String director, int releaseYear, double duration, String leadActor) 
    {
        super(title, director, releaseYear);
        this.duration = duration;
        this.leadActor = leadActor;
    }

    public String getGenre() 
    {
        return "Romantic Comedy";
    }

    public double getDuration() 
    {
        return duration;
    }

    public String getAdditionalInfo() 
    {
        return "Lead Actor: " + leadActor;
    }

    public void displayDetails() 
    {
        System.out.println(getBasicDetails());
        System.out.println("Genre: " + getGenre());
        System.out.println("Duration: " + getDuration() + " hours");
        System.out.println(getAdditionalInfo());
    }
}

class ThrillerMovie extends Movie 
{
    private double duration;
    private String thrillerType;

    public ThrillerMovie(String title, String director, int releaseYear, double duration, String thrillerType) 
    {
        super(title, director, releaseYear);
        this.duration = duration;
        this.thrillerType = thrillerType;
    }

    public String getGenre() 
    {
        return "Thriller";
    }

    public double getDuration() 
    {
        return duration;
    }

    public String getAdditionalInfo() 
    {
        return "Thriller Type: " + thrillerType;
    }

    public void displayDetails() 
    {
        System.out.println(getBasicDetails());
        System.out.println("Genre: " + getGenre());
        System.out.println("Duration: " + getDuration() + " hours");
        System.out.println(getAdditionalInfo());
    }
}

class SciFiMovie extends Movie 
{
    private double duration;
    private String universe;

    public SciFiMovie(String title, String director, int releaseYear, double duration, String universe) 
    {
        super(title, director, releaseYear);
        this.duration = duration;
        this.universe = universe;
    }

    public String getGenre() 
    {
        return "Science Fiction";
    }

    public double getDuration() 
    {
        return duration;
    }

    public String getAdditionalInfo() 
    {
        return "Universe: " + universe;
    }

    public void displayDetails() 
    {
        System.out.println(getBasicDetails());
        System.out.println("Genre: " + getGenre());
        System.out.println("Duration: " + getDuration() + " hours");
        System.out.println(getAdditionalInfo());
    }
}


public class MovieList 
{
     public static void main(String[] args) 
     {     
        Movie romCom = new RomComMovie("Notting Hill", "Roger Michell", 1999, 2.04, "Julia Roberts");
        Movie thriller = new ThrillerMovie("Se7en", "David Fincher", 1995, 2.13, "Psychological Thriller");
        Movie sciFi = new SciFiMovie("Inception", "Christopher Nolan", 2010, 2.28, "Dream Heist Universe");
        romCom.displayDetails();
        System.out.println();
        thriller.displayDetails();
        System.out.println();
        sciFi.displayDetails();
    }
}

