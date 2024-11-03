package exercism2;

import java.util.*;

public class Rectangles 
{

    public static int countRectangles(char[][] diagram) 
    {
        int rows = diagram.length;
        int cols = diagram[0].length;
        int count = 0;

        for (int r1 = 0; r1 < rows; r1++) 
        {
            for (int c1 = 0; c1 < cols; c1++) 
            {
                if (diagram[r1][c1] == '+') 
                {
                    for (int c2 = c1 + 1; c2 < cols; c2++) 
                    {
                        if (diagram[r1][c2] == '+' && isHorizontalEdge(diagram[r1], c1, c2)) 
                        {
                            for (int r2 = r1 + 1; r2 < rows; r2++) 
                            {
                                if (diagram[r2][c1] == '+' && diagram[r2][c2] == '+' && isHorizontalEdge(diagram[r2], c1, c2)) 
                                {
                                    if (isVerticalEdge(diagram, r1, r2, c1) && isVerticalEdge(diagram, r1, r2, c2)) 
                                    {
                                        count++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        
        return count;
    }

    private static boolean isHorizontalEdge(char[] row, int c1, int c2) 
    {
        for (int c = c1 + 1; c < c2; c++) 
        {
            if (row[c] != '-' && row[c]!='+') 
            {
                return false;
            }
        }
        return true;
    }

    private static boolean isVerticalEdge(char[][] diagram, int r1, int r2, int col) 
    {
        for (int r = r1 + 1; r < r2; r++) 
        {
            if (diagram[r][col] != '|' && diagram[r][col] != '+') 
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        List<char[]> lines = new ArrayList<>();

        System.out.println("Enter the ASCII diagram (empty line to end):");
        while (true) 
        {
            String line = sc.nextLine();
            if (line.isEmpty()) 
            {
                break; 
            }
            lines.add(line.toCharArray());
        }
        sc.close();
        char[][] diagram = lines.toArray(new char[0][]);
        int rectangles = countRectangles(diagram);
        System.out.println("Total rectangles: " + rectangles);
        System.out.println();
    }
}
