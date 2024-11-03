package exercism2;

import java.util.*;

public class KillerSudokuHelper 
{
    public static void main(String[] args) 
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter the cage Size: ");
    	int cageSize = sc.nextInt();
    	
        System.out.print("Enter the cage Sum: ");
        int cageSum = sc.nextInt();
        
        System.out.println("Enter the number of elements that are already present: ");
        int constraintSize=sc.nextInt();
        
        Set<Integer> constraints = new HashSet<>();
        while(constraintSize-- > 0)// to get the elements that are already present in the column
        	constraints.add(sc.nextInt());

        List<List<Integer>> validCombinations = new ArrayList<>();
        findValidCombinations(cageSum, cageSize, constraints, validCombinations, new ArrayList<Integer>(),1,0);
        
        displayOutput(cageSum,cageSize,validCombinations);
        sc.close();
    }
    public static void findValidCombinations(int cageSum, int cageSize, Set<Integer> constraints,List<List<Integer>> validCombinations, List<Integer> currCombo,int start,int currSum)
    {
    	if(currCombo.size()==cageSize)
    	{
    		if(cageSum==currSum)
    			validCombinations.add(new ArrayList<>(currCombo));
    		return;
    	}
    	for(int i=start;i<=9;i++)
    	{
    		int size=constraints.size();
    		constraints.add(i);
    		if(size!=constraints.size())
    		{
    		    currCombo.add(i);
    		    findValidCombinations(cageSum,cageSize,constraints,validCombinations,currCombo,i+1,currSum+i); // backtrack to get all combinations
    		    currCombo.remove(currCombo.size()-1);
    		    constraints.remove(i);
    		}
    	}
    }
    
    public static void displayOutput(int cageSum, int cageSize,List<List<Integer>> validCombinations)
    {
    	System.out.println("Valid combinations for sum " + cageSum + " with " + cageSize + " cells:");
    	for(List<Integer> temp: validCombinations)
        {
        	for(int element:temp)
        		System.out.print(element);
            System.out.println();
        }
    }
}

/*
OUTPUT

Enter the cage Size: 3
Enter the cage Sum: 7
Enter the number of elements that are already present: 
0
Valid combinations for sum 7 with 3 cells:
124

-------------------------------------------------------------
Enter the cage Size: 2
Enter the cage Sum: 10
Enter the number of elements that are already present: 
0
Valid combinations for sum 10 with 2 cells:
19
28
37
46

-------------------------------------------------------------
Enter the cage Size: 2
Enter the cage Sum: 10
Enter the number of elements that are already present: 
2
1 4
Valid combinations for sum 10 with 2 cells:
28
37

*/