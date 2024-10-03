package assignmentConditionalUnconditional;

import java.util.*;
public class GreatestNumber 
{
    public static void main(String[] args) 
    {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the first number: ");
		double firstNum=scanner.nextDouble(); // to get all number types used double
		
		System.out.print("Enter the second number: ");
		double secondNum=scanner.nextDouble();
		
		System.out.print("Enter the third number: ");
		double thirdNum=scanner.nextDouble();
		
		double maxNum=maxOfThree(firstNum,secondNum,thirdNum);
		System.out.print("The greatest of three numbers is "+maxNum);
		scanner.close();
	}
    public static double maxOfThree(double firstNum,double secondNum,double thirdNum)
    {
        if(firstNum > secondNum && firstNum > thirdNum)
        	return firstNum;
        else if(secondNum > thirdNum && secondNum >thirdNum)
        	return secondNum;
        else
        	return thirdNum; 		
    }
}

/*OUTPUT
Enter the first number: 98.65
Enter the second number: 5
Enter the third number: 139.06
The greatest of three numbers is 139.06
*/