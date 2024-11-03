package exercism2;

import java.util.Map;
import java.util.Scanner;

public class ResistorColorTrio 
{
    public static void main(String[] args) 
    {
    	Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.print("Enter the band colors separated by '-': ");
			String color=sc.next();
			String resistance=findResistance(color);
			if(resistance.equals("-1")) // to check whether the input color is valid one
			{
				System.out.println("No such band exists...");
				System.out.println();
				continue;
			}
			else if(resistance.equals("-2")) // to check whether the input at least three color bands
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
    public static String findResistance(String color)
    {
    	String[] colors=color.split("-");
    	if(colors.length<3)
    		return "-2";
    	Map<String, Integer> colorCode = Map.of("black", 0,"brown", 1,"red", 2,"orange", 3,"yellow", 4,
    			                                 "green",5,"blue", 6,"violet", 7,"grey", 8,"white", 9);

    	int firstValue = colorCode.getOrDefault(colors[0].toLowerCase(), -1);
        int secondValue = colorCode.getOrDefault(colors[1].toLowerCase(), -1);
        int thirdValue = colorCode.getOrDefault(colors[2].toLowerCase(), -1);

        if (firstValue == -1 || secondValue == -1 || thirdValue==-1) 
        {
            return "-1";
        }
        double resistance = firstValue * 10 + secondValue;
        resistance =resistance*Math.pow(10, thirdValue);
        
        String unit="ohm";
        if (resistance >= 1000000) 
        {
            resistance /= 1000000;
            unit = " megaohms";
        } 
        else if (resistance >= 1000) 
        {
            resistance /= 1000;
            unit = " kiloohms";
        } 
    	return resistance+" "+unit;
    }
}

/*
OUTPUT

Enter the band colors separated by '-': Red-Red-Brown
The resistance of the color Red-Red-Brown band is 220.0 ohm

Enter the band colors separated by '-': Red-Red-Orange
The resistance of the color Red-Red-Orange band is 22.0  kiloohms

Enter the band colors separated by '-': Red-Red-Green
The resistance of the color Red-Red-Green band is 2.2  megaohms

Enter the band colors separated by '-': Red-Red-Pink
No such band exists...

Enter the band colors separated by '-': Red-Red
Insufficient band colors!!!

*/