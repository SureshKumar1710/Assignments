package assignmentarraylistlinkedlist.linkedlist;

import java.util.*;
public class AddAndAccessElements 
{
    public static void main(String[] args) 
    {
		LinkedList<Integer> nums=new LinkedList<>();
		nums.add(5);
		nums.add(10);
		nums.add(15);
		nums.add(20);
		nums.add(25);
		
		System.out.println("First element: "+nums.getFirst());
		System.out.println("Last element: "+nums.getLast());
	}
}

/*
OUTPUT

First element: 5
Last element: 25
*/