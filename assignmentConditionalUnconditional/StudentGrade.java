package assignmentConditionalUnconditional;
import java.util.*;

public class StudentGrade 
{
    public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the marks: ");
		double score=sc.nextDouble();
		while(!(score>=0 && score<=100)) // check the limit of score and if not in limit get input again
		{
			System.out.println("Invalid score!!! , Enter the score again: ");
			score=sc.nextDouble();
		}
		char grade=getGrade(score);
		System.out.println("The grade of student with "+score+" marks is ' "+grade+" '");
		sc.close();
	}
    public static char getGrade(double score)
    {
    	int choice=(int)score/10; // to be used in the switch case
    	char grade='0';
    	switch(choice)
    	{
    	    case 0: case 1: case 2: case 3: 
    		    grade='F';
    		    break;
    	    case 4:
    		    grade='E';
    		    break;
    	    case 5:
    	    	grade='D';
    		    break;
    	    case 6:
    	    	grade='C';
    		    break;
    	    case 7:
    	    	grade='B';
    		    break;
    	    case 8:
    	    	grade='A';
    		    break;
    	    case 9: case 10:
    	    	grade='O';
    		    break;
    	}
    	return grade;
    }
}

/*OUTPUT
 Enter the marks: 123
Invalid score!!! , Enter the score again: 
469
Invalid score!!! , Enter the score again: 
78.34
The grade of student with 78.34 marks is ' B '
*/
