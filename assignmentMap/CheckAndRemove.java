package assignmentMap;

import java.util.*;
public class CheckAndRemove 
{
    public static void main(String[] args) 
    {
    	Map<String,Integer> studentMarks=new HashMap<>();
		studentMarks.put("John",85);
		studentMarks.put("Jane",92);
		studentMarks.put("Tom",76);
		studentMarks.put("Lucy",89);
		
		if(studentMarks.containsKey("Tom"))
			studentMarks.remove("Tom");
		
		for(Map.Entry<String, Integer> entry : studentMarks.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}

/*
John 85
Lucy 89
Jane 92
*/