package assignmentarraylistlinkedlist.linkedlist;

import java.util.LinkedList;

public class QueueBehaviourWithLinkedList 
{
	public static void main(String[] args) 
    {
		LinkedList<String> names=new LinkedList<>();
		
		enqueue(names,"Alice");
		enqueue(names,"Bob");
		enqueue(names,"Charlie");
		enqueue(names,"Diana");
		
		dequeue(names);
		dequeue(names);
		
		System.out.println("Names: "+names);
	}
	public static void enqueue(LinkedList<String> names,String name)
	{
		names.addLast(name);
	}
	public static void dequeue(LinkedList<String> names)
	{
		names.remove();
	}
}

/*
Names: [Charlie, Diana]
*/