package assignmentarraylistlinkedlist.arraylist;

import java.util.*;
public class SortTheArrayList 
{
	public static void main(String[] args) 
	{
        ArrayList<Integer> inputList = new ArrayList<>();
        
        Random random = new Random();
        
        for (int i = 0; i < 10; i++) 
        {
            inputList.add(random.nextInt(100) + 1);
        }
        
        System.out.println("Unsorted List: " + inputList);
        
        sortTheList(inputList);
        System.out.println("Sorted List: " + inputList);
    }
	
	public static void sortTheList(ArrayList<Integer> inputList)
	{
		for (int i = 0; i < inputList.size() - 1; i++) 
		{
            for (int j = 0; j < inputList.size() - i - 1; j++) 
            {
                if (inputList.get(j) > inputList.get(j + 1)) 
                {
                    int temp = inputList.get(j);
                    inputList.set(j, inputList.get(j + 1));
                    inputList.set(j + 1, temp);
                }
            }
        }
	}
}
