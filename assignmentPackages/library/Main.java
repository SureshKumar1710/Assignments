package library;

import library.books.*;
import library.members.*;
import library.transactions.*;
import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        BookCatalog catalog = new BookCatalog();
        MemberRegistry memberRegistry = new MemberRegistry();
        TransactionManager transactionManager = new TransactionManager();
        
        while (true) 
        {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Add Member");
            System.out.println("4. Display Members");
            System.out.println("5. Add Transaction");
            System.out.println("6. Display Transactions");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) 
            {
                case 1:
                    System.out.println("Enter details for the book:");
                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    System.out.print("Author: ");
                    String author = sc.nextLine();
                    System.out.print("ISBN: ");
                    String isbn = sc.nextLine();
                    catalog.addBook(new Books(title, author, isbn));
                    break;

                case 2: 
                    System.out.println("\nBooks in catalog:");
                    catalog.displayBooks();
                    break;

                case 3:
                    System.out.println("Enter details for the member:");
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Member ID: ");
                    String memberId = sc.nextLine();
                    memberRegistry.addMember(new Member(name, memberId));
                    break;

                case 4:
                    System.out.println("\nMembers in registry:");
                    memberRegistry.displayMembers();
                    break;

                case 5: 
                    System.out.println("Enter details for the transaction:");
                    System.out.print("Member ID: ");
                    String transactionMemberId = sc.nextLine();
                    System.out.print("ISBN of the book: ");
                    String transactionIsbn = sc.nextLine();
                    System.out.print("Transaction Type (borrow/return): ");
                    String transactionType = sc.nextLine();

                    Member member = memberRegistry.findMemberById(transactionMemberId);
                    Books book = catalog.findBookByIsbn(transactionIsbn);

                    if (member != null && book != null) {
                        transactionManager.addTransaction(new Transaction(member, book, transactionType));
                    } else {
                        System.out.println("Invalid member ID or book ISBN. Transaction could not be processed.");
                    }
                    break;

                case 6:
                	System.out.println("\nTransactions:");
                    transactionManager.displayTransactions();
                    break;

                case 7: 
                    System.out.println("Exiting the system...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please select again.");
            }
        }
    }
}

