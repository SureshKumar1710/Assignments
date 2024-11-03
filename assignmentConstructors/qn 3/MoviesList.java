package assignmentConstructors;
import java.util.*;

class MovieList // qn 3
{
    private ArrayList<Movie> movies;

    public MovieList() 
    {
        movies = new ArrayList<>();
    }

    public void addMovie(String title, String director, int releaseYear, String genre, double rating) 
    {
        Movie movie = new Movie(title, director, releaseYear, genre, rating);
        movies.add(movie);
        System.out.println("Movie added successfully!\n");
    }

    public void displayMovies() 
    {
        if (movies.isEmpty()) 
        {
            System.out.println("No movies available.\n");
        } 
        else 
        {
            for (Movie movie : movies) 
            {
            	System.out.println("Movie Title: "+movie.getTitle());
            	System.out.println("Director: "+movie.getDirector());
            	System.out.println("Release Year: "+movie.getReleaseYear());
            	System.out.println("Genre: "+movie.getGenre());
            	System.out.println("Rating: "+movie.getRating());
            }
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        MovieList moviesList = new MovieList();
        int choice = 0;

        while (choice != 3) {
            System.out.println("MENU");
            System.out.println("1. Add Movie");
            System.out.println("2. Display Movies");
            System.out.println("3. Exit");
            System.out.print("Your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Movie Title: ");
                    sc.nextLine(); 
                    String title = sc.nextLine();

                    System.out.print("Enter Director: ");
                    String director = sc.nextLine();

                    System.out.print("Enter Release Year: ");
                    int releaseYear = sc.nextInt();

                    System.out.print("Enter Genre: ");
                    sc.nextLine(); 
                    String genre = sc.nextLine();

                    System.out.print("Enter Rating: ");
                    double rating = sc.nextDouble();
                    System.out.println();

                    moviesList.addMovie(title, director, releaseYear, genre, rating);
                    break;

                case 2:
                    System.out.println();
                    moviesList.displayMovies();
                    break;

                case 3:
                    System.out.println("EXIT");
                    break;

                default:
                    System.out.println("No such option. Please choose again.\n");
            }
        }
        sc.close();
    }
}
