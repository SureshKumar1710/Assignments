package exercism2;
import java.math.*;
import java.util.*;

public class GrainsOnChessBoard 
{
    public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		while(true) // to get the input square until it is between 1 to 64
		{
			System.out.print("Enter the square number: ");
			int squareNum=sc.nextInt();
			if(squareNum<=0 || squareNum>64)
			{
				System.out.println("There is no such square!!!");
				System.out.println();
				continue;
			}
			System.out.print("Number of grains on square "+squareNum+" : ");
			System.out.println(grainsOnSquare(squareNum));
			break;
		}
		System.out.print("Total number of grains in Chess Board: ");
		System.out.println(grainsOnTotal());
		sc.close();
	}
    
    public static BigInteger grainsOnSquare(int squareNum) 
    {
        return BigInteger.valueOf(2).pow(squareNum - 1);
    }
    
    public static BigInteger grainsOnTotal() 
    {
        return (BigInteger.valueOf(2).pow(64)).subtract(BigInteger.valueOf(1));
    }
}


/*
OUTPUT

Enter the square number: 12
Number of grains on square 12 : 2048
Total number of grains in Chess Board: 18446744073709551615

Enter the square number: 65
There is no such square!!!

*/