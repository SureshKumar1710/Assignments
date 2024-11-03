package exercism2;
import java.util.*;

public class ResistorColor 
{
    public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		while(true) // to get the input band color till it is a valid one
		{
			System.out.print("Enter the band color: ");
			String color=sc.next();
			int resistance=findResistance(color.toLowerCase());
			if(resistance==-1)
			{
				System.out.println("No such band exists...");
				System.out.println();
				continue;
			}
			System.out.println("The resistance of the "+color+"color band is "+resistance);
			break;
		}
		sc.close();
	}
    public static int findResistance(String color)
    {
    	String[] bandColors= {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    	return Arrays.asList(bandColors).indexOf(color);
    }
}

/*
OUTPUT

Enter the band color: BLack
The resistance of the BLackcolor band is 0

Enter the band color: Pink
No such band exists...

*/