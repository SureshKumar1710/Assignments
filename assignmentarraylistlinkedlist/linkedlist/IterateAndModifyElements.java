package assignmentarraylistlinkedlist.linkedlist;

import java.util.*;
public class IterateAndModifyElements 
{

    public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		LinkedList<String> nums=new LinkedList<>(Arrays.asList("one","two","three","four","five"));
		
		System.out.println("Unmodified: "+nums);
		ListIterator<String> listItr=nums.listIterator();
		
		while(listItr.hasNext())
		{
			if(listItr.next().equals("three"))
				listItr.set("THREE");
		}
		System.out.println("Modified: "+nums);
		sc.close();
	}
}

/*
Unmodified: [one, two, three, four, five]
Modified: [one, two, THREE, four, five]
*/