package assignmentvectorandstack.stack;

import java.util.*;
public class BasicStackOperations 
{
    public static void main(String[] args) 
    {
		Stack<Integer> nums=new Stack<>();
		
		nums.push(10);
		nums.push(20);
		nums.push(30);
		nums.push(40);
		nums.push(50);
		
		nums.pop();
		
		System.out.println("Stack after pop: "+nums);
	}
}

/*
Stack after pop: [10, 20, 30, 40]
*/