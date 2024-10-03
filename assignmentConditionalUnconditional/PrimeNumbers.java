package assignmentConditionalUnconditional;
import java.util.*;

public class PrimeNumbers 
{
    public static void main(String[] args) 
    {
    	Scanner sc=new Scanner(System.in);
        System.out.println("The prime numbers between 1 and 30: ");
        for(int i=2;i<=30;i++)
        {
            if(isPrime(i)) // to check whether the number is prime
            	System.out.print(i+" ");
        }
        sc.close();
	}
    public static boolean isPrime(int range)
    {
        for(int i=2; i*i<=range ;i++)
        {
        	if(range%i==0)
        		return false;
        }
        return true;
    }
}

/*OUTPUT
The prime numbers between 1 and 30: 
2 3 5 7 11 13 17 19 23 29 
*/