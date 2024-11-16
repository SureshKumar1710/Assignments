package assignmentvectorandstack.vector;

import java.util.*;
public class CheckElementAndVectorSize 
{
    public static void main(String[] args) 
    {
		Vector<Double> doubles=new Vector<>();
		doubles.add(5.6);
		doubles.add(6.7);
		doubles.add(7.8);
		doubles.add(8.9);
		doubles.add(10.5);
		
		checkForElement(doubles,10.5);
		
		System.out.println("Size of vector before: "+doubles.size());
		System.out.println("Capacity of vector before: "+doubles.capacity());
		
		doubles.add(11.2);
		
		System.out.println("Size of vector after: "+doubles.size());
		System.out.println("Capacity of vector after: "+doubles.capacity());
	}
    public static void checkForElement(Vector<Double> doubles,double tar)
    {
    	for(double i : doubles)
    	{
    		if(i==10.5)
    		{
    			System.out.println("10.5 is in the vector");
    			return;
    		}
    	}
    	System.out.println("10.5 is not in the vector");
    }
}

/*
10.5 is in the vector
Size of vector before: 5
Capacity of vector before: 10
Size of vector after: 6
Capacity of vector after: 10
*/