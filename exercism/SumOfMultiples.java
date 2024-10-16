package exercism;
import java.util.*;

public class SumOfMultiples 
{
    public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the level completed: ");
		int level=sc.nextInt();
		
		System.out.print("Enter the no of magical items collected in this level: ");
		int itemCount=sc.nextInt();
		
		int[] baseValues=new int[itemCount];
		System.out.println("Enter the base values of each magical item: ");
		for(int i=0;i<itemCount;i++)
		{
			baseValues[i]=sc.nextInt();
		}
		
		int energyPoints=calculateEnergyPoints(baseValues,level);
		System.out.println("The player earns "+energyPoints+" energy points for completing level "+level+" and finding the "+itemCount+" magical items.");
		sc.close();
	}
    public static int calculateEnergyPoints(int[] baseValue, int level)
    {
    	Set<Integer> uniqueMultiples=new HashSet<>();
    	int energyPoints=0;
    	
    	for(int i=0;i<baseValue.length;i++) // to get all unique multiples of base values under the level completed
    	{
    		for(int j=baseValue[i];j<level;j+=baseValue[i])
    		{
    			uniqueMultiples.add(j);
    		}
    	}
    	
    	for(int i : uniqueMultiples)
    	{
    		energyPoints+=i;
    	}
    	return energyPoints;
    }
}

/*
OUTPUT

Enter the level completed: 20
Enter the no of magical items collected in this level: 2
Enter the base values of each magical item: 
3 5
The player earns 78 energy points for completing level 20 and finding the 2 magical items.

*/