package assignmentProblemsBasics;

import java.util.*;
public class AvgWeight 
{
    public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double[] weights=new double[10]; //declare array weights
		for(int i=0;i<10;i++)
		{
			weights[i]=scan.nextDouble(); //get the weights and store in weights
		}
		System.out.printf("%.2f",findAvg(weights));
		scan.close();
	}
    public static double findAvg(double[] weights)
    {
    	double sumOfWeights=0 ,weightLen=weights.length,avgOfWeights;
    	for(int i=0;i<weightLen;i++)
    	{
    		sumOfWeights+=weights[i]; //calculate the sum of the weights of 10 people
    	}
    	avgOfWeights=sumOfWeights/weightLen; //calculate average
    	return avgOfWeights;
    }
}

/*
OUTPUT
45.2 55.3 64.4 65.5 78.6 46.7 90.8 82.9 52.1 50
63.15
*/