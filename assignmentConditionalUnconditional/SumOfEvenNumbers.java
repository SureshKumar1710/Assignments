package assignmentConditionalUnconditional;
import java.util.*;
public class SumOfEvenNumbers 
{
    public static void main(String[] args) 
    {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the size of the array: ");
        int arrSize=sc.nextInt();
        int[] array=new int[arrSize];
        System.out.println("Enter the array elements: ");
        for(int i=0 ; i<arrSize ; i++)
        {
        	array[i]=sc.nextInt();
        }
        int evenSum=sumOfEvenNums(array);
        System.out.println("The sum of even numbers in the array: "+evenSum);
        sc.close();
	}
    public static int sumOfEvenNums(int[] array)
    {
    	int sum=0;
    	for(int i=0;i<array.length;i++)
    	{
    		if(array[i]%2!=0)
    			continue;
    	    sum+=array[i];
    	}
    	return sum;
    }
}

/*OUTPUT
Enter the size of the array: 10
Enter the array elements: 
2 5 89 46 13 56 78 11 5 39
The sum of even numbers in the array: 182
*/
