package assignmenthashing;

import java.util.*;

public class BasicOperations {

	public static void main(String[] args) {
		
		Map<String, String> grades = new HashMap<>();

		grades.put("Vijay", "A");
		grades.put("Ajith", "B");
		grades.put("Surya", "O");
		grades.put("Dhanush", "C"); 
		grades.put("Vijay", "O");
		
		for(Map.Entry<String, String> entry: grades.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

        System.out.println("\nVijay grade: " + grades.get("Vijay"));
	}
}

/*
Surya O
Ajith B
Vijay O
Dhanush C

Vijay grade: O
*/

// The values is updates on the key if the key already exists