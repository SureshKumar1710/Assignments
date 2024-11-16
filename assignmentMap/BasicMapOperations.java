package assignmentMap;

import java.util.*;
public class BasicMapOperations 
{
    public static void main(String[] args) 
    {
		Map<String,Integer> people=new HashMap<>();
		people.put("Alice",30);
		people.put("Bob",25);
		people.put("Charlie",35);
		people.put("Diana",28);
		people.put("Edward",40);
		
		System.out.println("Age of charlie: "+people.get("Charlie")+"\n");
		
		for(Map.Entry<String, Integer> entry : people.entrySet())
		{
			System.out.println("Name: "+entry.getKey()+"\nAge: "+entry.getValue()+"\n");
		}
	}
}


/*
Age of charlie: 35

Name: Diana
Age: 28

Name: Bob
Age: 25

Name: Alice
Age: 30

Name: Charlie
Age: 35

Name: Edward
Age: 40
*/
