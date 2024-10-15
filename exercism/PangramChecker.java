package exercism;
import java.util.*;

public class PangramChecker 
{
    public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence for pangram check: ");
		String input=sc.nextLine();
		boolean result=checker(input.toLowerCase());
		if(result)
			System.out.println("The given pangram is valid");
		else
			System.out.println("The given pangram is invalid");
		sc.close();
	}
    public static boolean checker(String input)
    {
    	if(input.length()<26)
    		return false;
    	int[] alphabet=new int[26];// done using an array, but can also use Set to avoid the count variable
    	int count=0;
    	for(int i=0;i<input.length();i++)
    	{
    		if(input.charAt(i)>=97 && input.charAt(i)<=122)
    		{
    			if(alphabet[input.charAt(i)-97]==0)
    				count++;
    			alphabet[input.charAt(i)-97]=1;
    		}
    	}
    	return count==26;
    }
}

/*OUTPUT
Enter the sentence for pangram check: 
The quick brown fox jumps over the lazy dog.
The given pangram is valid
*/

/*OUTPUT
Enter the sentence for pangram check: 
Hello everyone
The given pangram is invalid
 */
