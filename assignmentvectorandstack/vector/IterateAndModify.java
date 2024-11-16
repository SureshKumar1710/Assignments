package assignmentvectorandstack.vector;

import java.util.*;

public class IterateAndModify 
{
	public static void main(String[] args) 
    {
		Vector<String> fruits=new Vector<>(Arrays.asList("apple","banana","cherry","date","fig"));
		
		display(fruits);
		
		for(int i=0;i<fruits.size();i++)
		{
			if(fruits.get(i).equals("cherry"))
				fruits.set(i, "coconut");	
		}
		
		display(fruits);
		    
	}
	
	public static void display(Vector<String> fruits)
	{
        Enumeration<String> enumerate=fruits.elements();
		
		while(enumerate.hasMoreElements())
		{
			System.out.print(enumerate.nextElement()+" ");
		}
		System.out.println();
	}
}

/*
apple banana cherry date fig 
apple banana coconut date fig
*/
