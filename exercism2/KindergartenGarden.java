package exercism2;
import java.util.*;
public class KindergartenGarden 
{
    public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		String firstRow,secondRow;
		String[] childrenNames= {"Alice", "Bob", "Charlie", "David", "Eve", "Fred", "Ginny", "Harriet", "Ileana", "Joseph", "Kincaid", "Larry"};
		
		while(true) // to get the two rows of flowers until all flowers are present
		{
		    System.out.println("Enter the two rows of flower arrangement: ");
		    firstRow=sc.next();
		    secondRow=sc.next();
		    if(firstRow.length()!=24 || secondRow.length()!=24)
		    {
		    	System.out.println("Some of the flowers are missing!!!");
		    	continue;
		    }
		    break;
		}
		while(true) // iterate again and again till user likes to exit
		{
			System.out.println("Whose flowers do you need to know ?");
			String name=sc.next();
			String flowers[]=findFlowers(childrenNames,name,firstRow,secondRow);
			System.out.println("The flowers of "+name+" are ");
			for(String i: flowers)
			{
				System.out.print(i+" ");
			}
			System.out.println();
			System.out.println("Do you need to know any other's flowers? (Y,N): ");
			char choice=sc.next().charAt(0);
			if(choice=='N')
				break;
		    System.out.println();
		}
		sc.close();
	}
    
    public static String[] findFlowers(String[] childrenNames,String name,String firstRow,String secondRow)
    {
    	Map<Character,String> flowerList=Map.of('G',"Grass",'C',"Clover",'R',"Radish",'V',"Violet");
    	String[] flowers=new String[4];
        for(int i=0;i<childrenNames.length;i++)
        {
        	if(childrenNames[i].equals(name))
        	{
        		flowers[0]=flowerList.get(firstRow.charAt(i*2));
        		flowers[1]=flowerList.get(firstRow.charAt(i*2+1));
        		flowers[2]=flowerList.get(secondRow.charAt(i*2));
        		flowers[3]=flowerList.get(secondRow.charAt(i*2+1));
        	}
        }
        return flowers;
    }
}

/*
OUTPUT

Enter the two rows of flower arrangement: 
VRCGVVRVCGGCCGVRGCVCGCGV
VRCCCGCRRGVCGCRVVCVGCGCV
Whose flowers do you need to know ?
Kincaid
The flowers of Kincaid are 
Grass Clover Clover Grass 

Enter the two rows of flower arrangement: 
VCG
VCG
Some of the flowers are missing!!!
*/
