package assignmentvectorandstack.stack;

import java.util.*;
public class StackToArrayConversion 
{
    public static void main(String[] args) 
    {
		Stack<Double> doubleStack=new Stack<>();
		doubleStack.push(1.1);
		doubleStack.push(2.2);
		doubleStack.push(3.3);
		doubleStack.push(4.4);
		doubleStack.push(5.5);
		
		double[] doubleArray=convertToArray(doubleStack); 
		
		System.out.println("Double Array: ");
		for(double num : doubleArray)
			System.out.print(num+", ");
		
		Stack<Double> newdoubleStack=convertToStack(doubleArray);
		
		System.out.println("\nDouble Stack: ");
		for(double num: newdoubleStack)
			System.out.print(num+", ");
	}
    private static Stack<Double> convertToStack(double[] doubleArray) {
		Stack<Double> doubleStack=new Stack<>();
		for(double i : doubleArray)
			doubleStack.push(i);
		return doubleStack;
	}
    
	public static double[] convertToArray(Stack<Double> doubleStack)
    {
    	double[] doubleArray=new double[doubleStack.size()];
    	for(int i=doubleArray.length-1;i>=0;i--)
    	{
    		doubleArray[i]=doubleStack.pop();
    	}
    	return doubleArray;
    }
}

/*
Double Array: 
1.1, 2.2, 3.3, 4.4, 5.5, 
Double Stack: 
1.1, 2.2, 3.3, 4.4, 5.5, 
*/
