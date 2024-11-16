package assignmentarraylistlinkedlist.arraylist;

import java.util.*;

public class AddAndRetrieveElements 
{
    public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> fruitsList=new ArrayList<>();
		
		System.out.println("Add 5 fruits: ");
		
		for(int i=0;i<5;i++)
			fruitsList.add(sc.next());
		
		System.out.println();
		System.out.println("The Third fruit is "+fruitsList.get(2));
		
		sc.close();
	}
}

/*
OUTPUT

Add 5 fruits: 
Apple
Orange
Grapes
Guava
Kiwi

The Third fruit is Grapes
*/