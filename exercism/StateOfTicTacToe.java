package exercism;
import java.util.*;

public class StateOfTicTacToe 
{
    public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		char[][] board=new char[3][3];
		System.out.println("Enter the 3X3 board using 'X' and 'Y' if not filled use '.'");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				board[i][j]=sc.next().charAt(0);
			}
		}
		String res=checker(board);
		System.out.println("Current State: "+res);
		sc.close();
	}
    
    public static String checker(char[][] board)
    {
    	int xCount = 0, oCount = 0;
        boolean xWins = false, oWins = false;
        
    	for (int i = 0; i < 3; i++) 
    	{
    	    if (board[i][0] == board[i][1] && board[i][1] == board[i][2]) // check the row for any win
    	    {
                if (board[i][0] == 'X') 
                	xWins = true;
                if (board[i][0] == 'O') 
                	oWins = true;
            }
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i]) // check the column for any win
            {
                if (board[0][i] == 'X') 
                	xWins = true;
                if (board[0][i] == 'O') 
                	oWins = true;
            }
            for (int j = 0; j < 3; j++) // count no of X and O
            {
                if (board[i][j] == 'X') 
                	xCount++;
                else if (board[i][j] == 'O') 
                	oCount++;
            }
        }
    	
    	if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) // check l to r diagonal for any win
    	{
            if (board[0][0] == 'X') 
            	xWins = true;
            if (board[0][0] == 'O') 
            	oWins = true;
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) // check r to l diagonal for any win
        {
            if (board[0][2] == 'X') 
            	xWins = true;
            if (board[0][2] == 'O') 
            	oWins = true;
        }
        
        if (oCount > xCount || xCount - oCount > 1) // extra move X or O
    		return "Wrong turn order";
    	
    	if ((xWins && xCount == oCount) || (oWins && xCount > oCount)) // move after winning
    		return "Continued playing after win";

        if(xWins || oWins) // any player won
        	return "Win";
        
        if(xCount+oCount==9) // check if the board is fill so draw
        	return "Draw";
        return "Ongoing game";
    }	
}

/*
OUTPUT

Enter the 3X3 board using 'X' and 'Y' if not filled use '.'
X . .
. X O
O X .
Current State: Ongoing game

Enter the 3X3 board using 'X' and 'Y' if not filled use '.'
X O X
X X O
O X O
Current State: Draw

Enter the 3X3 board using 'X' and 'Y' if not filled use '.'
X X X
. O O
. . .
Current State: Win

Enter the 3X3 board using 'X' and 'Y' if not filled use '.'
O O X
. . .
. . .
Current State: Wrong turn order

Enter the 3X3 board using 'X' and 'Y' if not filled use '.'
X X X
O O O
. . .
Current State: Continued playing after win

*/
