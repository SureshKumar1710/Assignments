package exercism2;
import java.util.*;
public class RainDrops 
{
    public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		String sound=rainDropSound(num);
		System.out.println(sound);
		sc.close();
	}
    public static String rainDropSound(int num)
    {
        StringBuilder sound=new StringBuilder();
        if(num%3==0)
        	sound.append("Pling");
        if(num%5==0)
        	sound.append("Plang");
        if(num%7==0)
        	sound.append("Plong");
        if(sound.isEmpty())
        	sound.append(num);
        return sound.toString();
    }
}

/*
OUTPUT

Enter the number: 9
Pling

Enter the number: 25
Plang

Enter the number: 49
Plong

Enter the number: 30
PlingPlang

Enter the number: 70
PlangPlong

Enter the number: 42
PlingPlong

Enter the number: 105
PlingPlangPlong
*/