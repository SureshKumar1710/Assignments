package assignmentExceptionHandling;

import java.util.Scanner;

public class DivisionByZero 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        try 
        {
            System.out.print("Enter the Divident: ");
            int divident = sc.nextInt();

            System.out.print("Enter the Divisor: ");
            int divisor = sc.nextInt();
            
            int result = divident/divisor;
            System.out.println(result);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("A number cannot be divide by zero");
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        } 
        sc.close();  
    }
}
