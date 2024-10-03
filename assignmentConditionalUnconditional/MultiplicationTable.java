package assignmentConditionalUnconditional;
import java.util.*;

public class MultiplicationTable 
{
    public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Multiplier: ");
		int multiplier=sc.nextInt();
		multiplyTable(multiplier);
		sc.close();
	}
    public static void multiplyTable(int multiplier)
    {
    	for(int multiplicand=1; multiplicand<=20; multiplicand++)
    	{
    	    int product=multiplicand * multiplier;
    	    System.out.printf("%2d X %d = %d\n",multiplicand,multiplier,product);
    	}
    }
}

/*OUTPUT
Enter the Multiplier: 5
 1 x 5 = 5
 2 x 5 = 10
 3 x 5 = 15
 4 x 5 = 20
 5 x 5 = 25
 6 x 5 = 30
 7 x 5 = 35
 8 x 5 = 40
 9 x 5 = 45
10 x 5 = 50
11 x 5 = 55
12 x 5 = 60
13 x 5 = 65
14 x 5 = 70
15 x 5 = 75
16 x 5 = 80
17 x 5 = 85
18 x 5 = 90
19 x 5 = 95
20 x 5 = 100
*/