package exercism2;

import java.util.*;

public class ResistorColorDuo 
{
	public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.print("Enter the band colors separated by '-': ");
			String color=sc.next();
			int resistance=findResistance(color);
			if(resistance==-1) // to check whether the input color is valid one
			{
				System.out.println("No such band exists...");
				System.out.println();
				continue;
			}
			else if(resistance==-2) // to check whether the input at least two color bands
			{
				System.out.println("Insufficient band colors!!!");
				System.out.println();
				continue;
			}
			System.out.println("The resistance of the color "+color+" band is "+resistance);
			break;
		}
		sc.close();
	}
    public static int findResistance(String color)
    {
    	String[] colors=color.split("-");
    	if(colors.length<2)
    		return -2;
    	Map<String, Integer> colorCode = Map.of("black", 0,"brown", 1,"red", 2,"orange", 3,"yellow", 4,
    			                                 "green",5,"blue", 6,"violet", 7,"grey", 8,"white", 9);

    	int firstValue = colorCode.getOrDefault(colors[0].toLowerCase(), -1);
        int secondValue = colorCode.getOrDefault(colors[1].toLowerCase(), -1);
        if (firstValue == -1 || secondValue == -1) 
        {
            return -1;
        }
        int resistance = firstValue * 10 + secondValue;
    	return resistance;
    }
}

/*
OUTPUT

Enter the band colors separated by '-': Blue-Black
The resistance of the color Blue-Black band is 60

Enter the band colors separated by '-': Black-Pink
No such band exists...

Enter the band colors separated by '-': Black
Insufficient band colors!!!
*/