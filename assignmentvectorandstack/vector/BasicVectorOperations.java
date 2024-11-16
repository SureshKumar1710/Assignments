package assignmentvectorandstack.vector;

import java.util.*;
public class BasicVectorOperations 
{
    public static void main(String[] args) 
    {
		Vector<Integer> nums=new Vector<>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.add(50);
		
		System.out.println("Third Element: "+nums.get(2));
	}
}

/*
Third Element: 30
*/