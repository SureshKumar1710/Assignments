package assignmentvectorandstack.vector;

import java.util.*;
public class VectorToArrayConversion 
{
    public static void main(String[] args) 
    {
    	Vector<String> colorsVector=new Vector<>(Arrays.asList("red","green","blue","yellow"));
    	String[] colorsArray=vectorToArray(colorsVector);
    	
    	System.out.println("Colors Array: ");
        for(String i : colorsArray)
        	System.out.print(i+" ");
    	
    	Vector<String> newColorsVector= arrayToVector(colorsArray);
    	
    	System.out.println("\nColors Vector: ");
    	System.out.println(newColorsVector);
	}
    
    public static String[] vectorToArray(Vector<String> colorsVector)
    {
    	String[] arr=new String[colorsVector.size()];
    	for(int i=0;i<colorsVector.size();i++)
    	{
    		arr[i]=colorsVector.get(i);	
    	}
    	return arr;
    }
    
    public static Vector<String> arrayToVector(String[] colorsArray)
    {
    	Vector<String> newColorsVector=new Vector<>();
    	for(String color:colorsArray)
    	{
    		newColorsVector.add(color);
    	}
    	return newColorsVector;
    }
}

/*
Colors Array: 
red green blue yellow 
Colors Vector: 
[red, green, blue, yellow]
*/
