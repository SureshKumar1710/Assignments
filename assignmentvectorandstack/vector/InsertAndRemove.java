package assignmentvectorandstack.vector;

import java.util.*;
public class InsertAndRemove 
{
    public static void main(String[] args) 
    {
		Vector<Character> chars=new Vector<>();
		chars.add('A');
		chars.add('B');
		chars.add('C');
		chars.add('D');
		chars.add('E');
		
		System.out.println("Before: "+chars);
		
		chars.add(2, 'X');
		chars.remove(0);
		
		System.out.println("After: "+chars);
	}
}

/*
Before: [A, B, C, D, E]
After: [B, X, C, D, E]
*/
