package assignmentInheritance.libraryManagement;

import java.util.*;

import university.students.Student;

public class LibraryManagementSystem {
    private String userType;
    private String userName;
    private String password;

    private List<User> users;
    private List<Book> books;
    private Librarian librarian;
    private LibraryDatabase libraryDatabase;

    public LibraryManagementSystem(Librarian librarian, List<User> users, List<Book> books, LibraryDatabase libraryDatabase) {
        this.librarian = librarian;
        this.users = users != null ? users : new ArrayList<>();
        this.books = books != null ? books : new ArrayList<>();
        this.libraryDatabase = libraryDatabase != null ? libraryDatabase : new LibraryDatabase(this.books);
    }

    public String login() {
        return "Login successful";
    }

    public String register() {
        return "Registration successful";
    }

    public String logout() {
        return "Logout successful";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the librarian's name: ");   
        String librarianName = sc.nextLine();
        System.out.print("Enter the librarian's ID: ");
        int librarianId = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter the librarian's password: ");
        String librarianPassword = sc.nextLine();

        Librarian librarian = new Librarian(librarianName, librarianId, librarianPassword, new LibraryDatabase(new ArrayList<>()));

        List<User> users = new ArrayList<>();
        
        System.out.print("Enter the student's name: ");  // if student
        String studentName = sc.nextLine();
        System.out.print("Enter the student's ID: ");
        int studentId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the student's class name: ");
        String className = sc.nextLine();
        
        User student = new Students(studentName, studentId, className);
        users.add(student);

        System.out.print("Enter the staff member's name: ");    // if staff
        String staffName = sc.nextLine();
        System.out.print("Enter the staff member's ID: ");
        int staffId = sc.nextInt();
        sc.nextLine();  
        System.out.print("Enter the staff member's department: ");
        String staffDept = sc.nextLine();
        
        User staff = new Staff(staffName, staffId, staffDept);
        users.add(staff);

        List<Book> books = new ArrayList<>();
        Book book1 = new Book("Jungle book", "Author", "1596874563", "2001");
        Book book2 = new Book("JAVA", "Herbert Schildt", "9876543021", "2023");
        books.add(book1);
        books.add(book2);

        LibraryDatabase libraryDatabase = new LibraryDatabase(books);
        LibraryManagementSystem lms = new LibraryManagementSystem(librarian, users, books, libraryDatabase);

        lms.register();
        lms.login();

        System.out.println("List of books in the library:");
        for (Book book : lms.books) 
        {
            System.out.println(book.getTitle());
        }

        lms.logout();
        sc.close();
    }

}
