package exercism2;
import java.util.*;

public class RNATranscription 
{
    public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		while(true) // to get the input until it is a valid dna strand
		{
		    System.out.println("Enter the DNA Sequence: ");
		    String dnaSeq=sc.next();
		    String rnaTranscript=transcript(dnaSeq);
		    if(rnaTranscript==null)
		    {
		    	System.out.println("This is not a DNA strand.");
		    	System.out.println();
		    	continue;
		    }
		    System.out.println("The Transcribed RNA strand of "+dnaSeq+" is "+rnaTranscript);
		    break;
		}
		sc.close();
	}
    public static String transcript(String dnaSeq)
    {
    	StringBuilder rnaSeq=new StringBuilder();
        for (char c : dnaSeq.toCharArray()) 
        {
            switch (c) 
            {
                case 'A':
                    rnaSeq.append('U');
                    break;
                case 'G':
                	rnaSeq.append('C');
                    break;
                case 'C':
                	rnaSeq.append('G');
                    break;
                case 'T':
                	rnaSeq.append('A');
                    break;
                default:
                	return null;
            }
        }
        return rnaSeq.toString();
    }
}


/*
OUTPUT:

Enter the DNA Sequence: 
AGCCGTTGACA
The Transcribed RNA strand of AGCCGTTGACA is UCGGCAACUGU

Enter the DNA Sequence: 
ACGTTU
This is not a DNA strand.

*/

