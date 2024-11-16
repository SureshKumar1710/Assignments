package assignmentarraylistlinkedlist.arraylist;

import java.util.*;
public class IterateAndRemoveElements 
{
    public static void main(String[] args) 
    {
		ArrayList<Integer> nums=new ArrayList<>(Arrays.asList(10,20,30,40,50));
		
		Iterator<Integer> iterator=nums.iterator();
		
		while(iterator.hasNext())
			if((int)iterator.next()>30)
				iterator.remove();
		
		System.out.println("Modified List: "+nums);
	}
}


/*
OUTPUT

Modified List: [10, 20, 30]
*/