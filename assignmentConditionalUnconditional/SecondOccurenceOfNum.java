package assignmentConditionalUnconditional;
import java.util.*;

public class SecondOccurenceOfNum 
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
        System.out.print("Enter the target value: ");
        int targetValue=sc.nextInt();
        int index=getSecondIndex(array,targetValue);
        if(index!=-1)
            System.out.println("The second occurence of "+targetValue+" is at index :"+index);
        else
        	System.out.println("There is no second occurence of "+targetValue);
        sc.close();
	}
    public static int getSecondIndex(int[] array,int target)
    {
    	int count=0;
    	for(int i=0;i<array.length;i++)
    	{
    		if(array[i]==target)
    		{
    			if(count==0)
    				count++;
    			else 
    				return i;
    		}
    	}
    	return -1;
    }
}

/*OUTPUT
Enter the size of the array: 10
Enter the array elements: 
45 62 35 98 78 12 36 20 368 1
Enter the target value: 45
There is no second occurence of 45
*/

/*OUTPUT
Enter the size of the array: 10
Enter the array elements: 
45 62 35 98 78 12 45 36 20 123
Enter the target value: 45
The second occurence of 45 is at index :6
*/
