package exercism2;
import java.util.*;

public class PythagoreanTriplet 
{
    public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer N: ");
		int N=sc.nextInt();
		List<List<Integer>> triplets=getTriplets(N);
		if(triplets.size()>0)
		{
			System.out.println("There Pythagorean triplets are");
		    System.out.println(triplets);
		}
		else
			System.out.println("There are no Pythagorean triplets");
	    sc.close();
	}
    public static List<List<Integer>> getTriplets(int N)
    {
    	List<List<Integer>> triplets=new ArrayList<>();
        for (int a = 1; a < N / 3; a++) 
        {
            for (int b = a + 1; b < N / 2; b++) 
            {
                int c = N - a - b;
                if (a*a + b*b == c*c) 
                {
                	triplets.add(new ArrayList<Integer>(Arrays.asList(a,b,c)));
                }
            }
        }
        return triplets;
    }
}

/*
OUTPUT

Enter the integer N: 
50
There are no Pythagorean triplets

Enter the integer N: 
120
There Pythagorean triplets are
[[20, 48, 52], [24, 45, 51], [30, 40, 50]]

*/