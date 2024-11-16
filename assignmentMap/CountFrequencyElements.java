package assignmentMap;

import java.util.*;
public class CountFrequencyElements 
{
    public static void main(String[] args) 
    {
    	Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Word: ");
        String word=sc.next();
        
        Map<Character, Integer> freq=new HashMap<>();
        for(char c: word.toCharArray())
        {
        	freq.put(c,freq.getOrDefault(c,0)+1);
        }
        
        for(Map.Entry<Character, Integer> entry : freq.entrySet())
        {
        	System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
        sc.close();
	}
}

/*
Programming
P -> 1
a -> 1
r -> 2
g -> 2
i -> 1
m -> 2
n -> 1
o -> 1
*/