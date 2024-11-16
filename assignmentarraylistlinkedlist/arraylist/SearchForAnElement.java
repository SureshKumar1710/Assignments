package assignmentarraylistlinkedlist.arraylist;

import java.util.*;

public class SearchForAnElement 
{
	public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		ArrayList<Character> chars=new ArrayList<>(Arrays.asList('a','g','l','q','u','y','5',']','0','$'));
		
		System.out.print("Enter the Character to search: ");
		char target=sc.next().charAt(0);
		int res= getIndex(chars,target);
		
		if(res!=-1)  
			System.out.println(target+" is found at index "+res);
		else
			System.out.println(target+" is not found");
	    sc.close();
	}
	
	public static int getIndex(ArrayList<Character> chars, char target)
	{
		for(int i=0;i<chars.size();i++)
		{
			if(chars.get(i)==target)
				return i;
		}
		return -1;
	}
}


/*
OUTPUT

Enter the Character to search: 5
5 is found at index 6

Enter the Character to search: >
> is not found


*/