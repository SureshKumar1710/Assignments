package assignmentvectorandstack.stack;

import java.util.*;
public class PeekAndSearch 
{
    public static void main(String[] args) 
    {
		Stack<String> values=new Stack<>();
		values.push("first");
		values.push("second");
		values.push("third");
		values.push("fourth");
		
		System.out.println("The top element of stack: "+values.peek());
		
		search(values,"second");
		
		System.out.println("Stack: "+values);
	}
    
    public static void search(Stack<String> values,String target)
    {
    	for(int i=0;i<values.size();i++)
    	{
    		if(values.get(i).equals(target))
    		{
    			System.out.println(target+" found at "+i);
    			return;
    		}
    	}
    	System.out.println("Target not found");
    }
}

/*
The top element of stack: fourth
second found at 1
Stack: [first, second, third, fourth]
*/
