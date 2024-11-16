package assignmentarraylistlinkedlist.linkedlist;

import java.util.*;
public class LinkedListOperation 
{
    public static void main(String[] args) 
    {
		LinkedList<Integer> nums=new LinkedList<>();
		for(int i=1;i<=10;i++)
		{
			nums.add(i);
		}
		
		System.out.println("Unmodified: "+nums);
		
		nums.remove(2);
		
		int lastIndex=nums.size()-1;
		nums.remove(lastIndex);
		System.out.println("Modified: "+nums);
	}
}
