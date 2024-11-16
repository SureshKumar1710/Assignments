package assignmentMap;

import java.util.*;
public class IterateThroughMap 
{
    public static void main(String[] args) 
    {
		TreeMap<String,Integer> fruits=new TreeMap<>();
		fruits.put("banana", 2);
		fruits.put("apple", 5);
		fruits.put("cherry", 7);
		fruits.put("date", 3);
		
		Set<Map.Entry<String, Integer>> entries= fruits.entrySet();
		
		Iterator<Map.Entry<String, Integer>> itr=entries.iterator();

		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}

/*
apple=5
banana=2
cherry=7
date=3
*/