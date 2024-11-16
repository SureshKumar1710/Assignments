package assignmentarraylistlinkedlist.arraylist;

import java.util.*;
public class CovertListToArrayAndViceVersa 
{
    public static void main(String[] args) 
    {
		ArrayList<String> fruitList=new ArrayList<>();
		fruitList.add("apple");
		fruitList.add("banana");
		fruitList.add("cherry");
		
		String[] fruitArray=fruitList.toArray(new String[0]);
		
		System.out.println("Array:");
		for(String fruit : fruitArray)
			System.out.print(fruit+" ");
		
		ArrayList<String> newFruitList=new ArrayList<>(Arrays.asList(fruitArray));
		
		System.out.println("\nArray List:");
		for(String fruit : newFruitList)
			System.out.print(fruit+" ");
	}
}


/*
OUTPUT

Array:
apple banana cherry 
Array List:
apple banana cherry 
*/