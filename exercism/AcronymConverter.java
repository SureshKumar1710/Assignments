package exercism;
import java.util.*;

public class AcronymConverter 
{
    public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Phrase: ");
		String inputLine=sc.nextLine();
		String result= converter(inputLine);
		System.out.println("The acronym of the given phrase is: "+result);
		sc.close();
	}
    public static String converter(String input)
    {
    	StringBuilder resultString=new StringBuilder();
    	for(int i=0;i<input.length();i++)
    	{
    		if(i==0 || input.charAt(i-1)==' ' || input.charAt(i-1)=='-') // As the words are seperated by '-' and ' '
    			resultString.append(input.charAt(i));
    	}
    	return resultString.toString().toUpperCase();
    }
}

/*OUTPUT
Enter the Phrase: Thank George It's Friday!
The acronym of the given phrase is: TGIF
*/
