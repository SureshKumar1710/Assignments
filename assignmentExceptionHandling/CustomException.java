package assignmentExceptionHandling;

import java.util.Scanner;

public class CustomException 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Gmail ID: ");
        String email = sc.nextLine();

        try 
        {
        	if (!email.endsWith("@gmail.com")) 
            {
                throw new InvalidGmailException("Invalid Gmail ID. It must end with '@gmail.com'.");
            }
            System.out.println("Valid Gmail ID");
        } 
        catch (InvalidGmailException e) 
        {
            System.out.println(e.getMessage());
        } 
        finally
        {
            sc.close();
        }
    }

    public static void checkGmailId(String email) throws InvalidGmailException 
    {
        
    }
}

class InvalidGmailException extends Exception 
{
    public InvalidGmailException(String message) 
    {
       super(message);
    }
}

