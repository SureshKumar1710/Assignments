package assignmentvectorandstack.stack;

import java.util.*;
public class ReverseAString 
{
    public static void main(String[] args) 
    {
		String str="hello";
		String reverseStr=reverse(str);
		System.out.println(reverseStr);
	}
    public static String reverse(String str)
    {
    	StringBuilder result=new StringBuilder();
    	Stack<Character> revStack=new Stack<>();
    	
    	for(char c : str.toCharArray())
    		revStack.push(c);
        while(!revStack.isEmpty())
        {
        	result.append(revStack.pop());
        }
        return result.toString();
    }
}

/*
olleh
*/
