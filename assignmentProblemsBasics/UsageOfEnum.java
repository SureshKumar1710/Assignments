package assignmentProblemsBasics;

import java.util.*;
public class UsageOfEnum 
{
	enum Day 
	{
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }
    public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers between 1 to 7: ");
		int inputNum=sc.nextInt();
		if(inputNum>0 && inputNum<8)
		    System.out.println(Day.values()[inputNum-1]);
		else
			System.out.println("Incorrect Input");
		sc.close();
	}
}

/*
OUTPUT
Enter numbers between 1 to 7: 
5
THURSDAY
*/