package assignmentMap;

import java.util.*;
public class MergeTwoMaps 
{
    public static void main(String[] args) 
    {
		Map<String,Integer> map1=new HashMap<>();
		map1.put("a", 1);
		map1.put("b", 2);
		
		Map<String,Integer> map2=new HashMap<>();
		map2.put("b", 3);
		map2.put("c", 4);
		
		map1.putAll(map2);
		
		for(Map.Entry<String, Integer> entry : map1.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}

/*
a 1
b 3
c 4
*/
