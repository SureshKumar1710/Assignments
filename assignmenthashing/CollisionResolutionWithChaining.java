package assignmenthashing;

import java.util.LinkedList;

public class CollisionResolutionWithChaining {

    public static void main(String[] args) {
        HashTable hashTable = new HashTable(5);
        hashTable.add(1, "Suresh");
        hashTable.add(2, "Ramesh");
        hashTable.add(3, "Dinesh");
        hashTable.add(4, "Ganesh");
        hashTable.add(5, "Rajesh");
        hashTable.add(6, "Suresh"); // duplicate values allowed
        hashTable.add(6, "Harish"); // update in the same key
        
        System.out.println("Hash table:\n");
        
        hashTable.printTable();
        
        System.out.println("\nGet Value of '2': "+hashTable.get(2));
        
    }

}

class Node 
{
    int key;
    String value;

    Node(int key, String value) 
    {
        this.key = key;
        this.value = value;
    }
}


class HashTable 
{
    private final int size;
    private final LinkedList<Node>[] table;

    @SuppressWarnings("unchecked")
    public HashTable(int size) 
    {
        this.size = size;
        this.table = new LinkedList[size];
        for (int i = 0; i < size; i++) 
        {
            table[i] = new LinkedList<>();
        }
    }

    private int hashFunction(int key) 
    {
        return key % size;
    }

    public void add(int key, String value) 
    {
        int index = hashFunction(key);
        LinkedList<Node> temp = table[index];
        for (Node node : temp) 
        {
            if (node.key == key) 
            {
                node.value = value;
                return;
            }
        }
        temp.add(new Node(key, value));
    }

    public String get(int key) 
    {
        int index = hashFunction(key);
        LinkedList<Node> temp = table[index];
        for (Node node : temp) 
        {
            if (node.key == key) 
            {
                return node.value;
            }
        }
        return null;
    }

    public void printTable() 
    {
        for (int i = 0; i < size; i++) 
        {
            System.out.print("Row " + i + ": ");
            for (Node node : table[i]) 
            {
                System.out.print("( Key: " + node.key + ", Value: " + node.value + ") ");
            }
            System.out.println();
        }
    }
}

/*
Hash table:

Row 0: ( Key: 5, Value: Rajesh) 
Row 1: ( Key: 1, Value: Suresh) ( Key: 6, Value: Harish) 
Row 2: ( Key: 2, Value: Ramesh) 
Row 3: ( Key: 3, Value: Dinesh) 
Row 4: ( Key: 4, Value: Ganesh) 

Get Value of '2': Ramesh
*/