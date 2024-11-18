package assignmenthashing;

public class CollisionResolutionWithLinearProbing 
{
	 public static void main(String[] args) 
	 {
		 HashTableLP hashTable = new HashTableLP(5);
	     hashTable.add(1, "Suresh");
	     hashTable.add(2, "Ramesh");
//	     hashTable.add(3, "Dinesh");
         hashTable.add(4, "Ganesh");
	     hashTable.add(5, "Rajesh");
	     hashTable.add(6, "Suresh"); // duplicate values allowed, insert in next available row
         hashTable.add(6, "Harish"); // update in the same key
         hashTable.add(7, "Dinesh");
	     
	     System.out.println("Hash table:\n");
	     
         hashTable.printTable();
	        
	     System.out.println("\nGet Value of '2': "+hashTable.get(2));
	}
}

class HashTableLP 
{
    private final int size;
    private final int[] keys;
    private final String[] values;

    public HashTableLP(int size) 
    {
        this.size = size;
        this.keys = new int[size];
        this.values = new String[size];
        for (int i = 0; i < size; i++) 
        {
            keys[i] = -1; 
        }
    }

    private int hashFunction(int key) 
    {
        return key % size;
    }

    public void add(int key, String value) 
    {
        int index = hashFunction(key);
        int temp=index;
        boolean flag=false;
//        for(int i=0;i<size;i++)
//        {
//        	if(keys[index] != -1 && keys[index] != key) 
//            {
//                index = (index + 1) % size; 
//            }
//        }
        while (keys[index] != -1 && keys[index] != key) 
        {
            index = (index + 1) % size; 
            if(flag && index==temp)
            {
            	System.out.println("Cannot insert, Table is full\n");
            	return;
            }
            flag=true;
        }
        System.out.println("Inserted...");
        keys[index] = key;
        values[index] = value;
    }

    public String get(int key) 
    {
        int index = hashFunction(key);
        for(int i=0;i<size;i++)
        {
            if (keys[index] == key) 
            {
                return values[index];
            }
            index = (index + 1) % size;
        }
        return null;
    }

    public void printTable() 
    {
        for (int i = 0; i < size; i++) 
        {
            System.out.print("Row " + i + ": ");
            if (keys[i] == -1) 
            {
                System.out.println("Empty");
            } 
            else 
            {
                System.out.println("( Key: " + keys[i] + ", Value: " + values[i] + " )");
            }
        }
    }
}

/*
Inserted...
Inserted...
Inserted...
Inserted...
Inserted...
Inserted...
Cannot insert, Table is full

Hash table:

Row 0: ( Key: 5, Value: Rajesh )
Row 1: ( Key: 1, Value: Suresh )
Row 2: ( Key: 2, Value: Ramesh )
Row 3: ( Key: 6, Value: Harish )
Row 4: ( Key: 4, Value: Ganesh )

Get Value of '2': Ramesh
*/