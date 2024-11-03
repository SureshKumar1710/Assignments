package assignmentExceptionHandling;

import java.util.*;

public class PhoneNumberValidator 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        try 
        {
            System.out.print("Enter your phone number (digits only): ");
            long phoneNumber = sc.nextLong();

            System.out.println("Phone number entered: " + phoneNumber);
        } 
        catch (InputMismatchException e) 
        {
            System.out.println("Invalid input. Please enter numeric digits only for the phone number.");
        } 
        finally 
        {
            sc.close();
        }
    }
}

