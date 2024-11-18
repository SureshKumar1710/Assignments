package assignmenthashing;

import java.util.*;
public class LoadFactorAndRehashing 
{
	public static void main(String[] args) 
	{
		HashTable3 hashTable = new HashTable3(4);
	     hashTable.add(1, "Suresh");
	     hashTable.add(2, "Ramesh");
	     hashTable.add(3, "Dinesh");
         hashTable.add(4, "Ganesh");
        
        System.out.println("Hash table before exceeding load factor:");
        hashTable.printTable();

        hashTable.add(5, "Rajesh");

        System.out.println("\nHash table after rehashing:");
        hashTable.printTable();
    }
}

class HashTable3 {
    private int size;
    private int count;
    private int[] keys;
    private String[] values;
    private static final double LOAD_FACTOR = 0.75;

    public HashTable3(int initialSize) 
    {
        this.size = initialSize;
        this.keys = new int[size];
        this.values = new String[size];
        Arrays.fill(keys, -1); 
        this.count = 0;
    }

    private int hashFunction(int key) 
    {
        return key % size;
    }

    public void add(int key, String value) 
    {
        if ((double) count / size > LOAD_FACTOR) 
        {
            rehash();
        }
        int index = hashFunction(key);
        while (keys[index] != -1 && keys[index] != key) 
        {
            index = (index + 1) % size; 
        }
        count++;
        keys[index] = key;
        values[index] = value;
    }

    private void rehash() 
    {
        int newSize = size * 2;
        int[] oldKeys = keys;
        String[] oldValues = values;

        keys = new int[newSize];
        values = new String[newSize];
        Arrays.fill(keys, -1);
        size = newSize;
        count = 0;

        for (int i = 0; i < oldKeys.length; i++) 
        {
            if (oldKeys[i] != -1) 
            {
                add(oldKeys[i], oldValues[i]);
            }
        }

        System.out.println("\nNew size: " + size);
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
Hash table before exceeding load factor:
Row 0: ( Key: 4, Value: Ganesh )
Row 1: ( Key: 1, Value: Suresh )
Row 2: ( Key: 2, Value: Ramesh )
Row 3: ( Key: 3, Value: Dinesh )

New size: 8

Hash table after rehashing:
Row 0: Empty
Row 1: ( Key: 1, Value: Suresh )
Row 2: ( Key: 2, Value: Ramesh )
Row 3: ( Key: 3, Value: Dinesh )
Row 4: ( Key: 4, Value: Ganesh )
Row 5: ( Key: 5, Value: Rajesh )
Row 6: Empty
Row 7: Empty
*/