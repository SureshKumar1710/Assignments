package assignmentarraylistlinkedlist.linkedlist;

import java.util.*;
public class ReverseLinkedList 
{
    public static void main(String[] args) 
    {
		LinkedList<Character> chars=new LinkedList<>(Arrays.asList('A','B','C','D','E'));
		
		System.out.println("Original Linked List: "+chars);
		
		reverse(chars);
		
		System.out.println("Reversed Linked List: "+chars);
	}
    
    public static void reverse(LinkedList<Character> chars)
    {
    	for(int i=chars.size()-1;i>=0;i--)
    	{
    	    chars.addLast(chars.remove(i));	
    	}
    }
}

/*
Original Linked List: [A, B, C, D, E]
Reversed Linked List: [E, D, C, B, A]
*/