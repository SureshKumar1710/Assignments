package assignmentvectorandstack.stack;

import java.util.*;
public class Balancedparenthesis 
{
    public static void main(String[] args) 
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the parenthesis: ");
		String parenthesis=sc.next();
		if(isValid(parenthesis))
			System.out.println("It is valid parenthesis");
		else
			System.out.println("It is invalid parenthesis");
	    sc.close();
	}
    
    public static boolean isValid(String parenthesis)
    {
    	Stack<Character> parenthesisStack=new Stack<>();
    	for(char c : parenthesis.toCharArray())
    	{
    		if(c=='(')
    		    parenthesisStack.push(c);
    		else
    		{
    			if(parenthesisStack.isEmpty())
    				return false;
    			parenthesisStack.pop();
    		}
    	}
    	return parenthesisStack.isEmpty();
    }
}

/*
(()
It is invalid parenthesis

()
It is valid parenthesis
*/