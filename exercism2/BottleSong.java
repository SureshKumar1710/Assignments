package exercism2;

public class BottleSong 
{
    public static void main(String[] args) 
    {
		String lyrics=getLyrics();
		System.out.println(lyrics);
	}
    public static String getLyrics()
    {
    	String[] num = {"No", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
    	StringBuilder lyrics=new StringBuilder();
    	for (int i = 10; i > 0; i--) // from 10 bottles, take one by one until reaches zero 
    	{
            lyrics.append(num[i] + " green bottles hanging on the wall,\n");
            lyrics.append(num[i] + " green bottles hanging on the wall,\n");
            lyrics.append("And if one green bottle should accidentally fall,\n");
            lyrics.append("There'll be " +num[i-1].toLowerCase()+ " green bottles hanging on the wall.\n");
            lyrics.append('\n');
        }
    	return lyrics.toString();
    }
}
/*
OUTPUT

Ten green bottles hanging on the wall,
Ten green bottles hanging on the wall,
And if one green bottle should accidentally fall,
There'll be nine green bottles hanging on the wall.

Nine green bottles hanging on the wall,
Nine green bottles hanging on the wall,
And if one green bottle should accidentally fall,
There'll be eight green bottles hanging on the wall.

Eight green bottles hanging on the wall,
Eight green bottles hanging on the wall,
And if one green bottle should accidentally fall,
There'll be seven green bottles hanging on the wall.

Seven green bottles hanging on the wall,
Seven green bottles hanging on the wall,
And if one green bottle should accidentally fall,
There'll be six green bottles hanging on the wall.

Six green bottles hanging on the wall,
Six green bottles hanging on the wall,
And if one green bottle should accidentally fall,
There'll be five green bottles hanging on the wall.

Five green bottles hanging on the wall,
Five green bottles hanging on the wall,
And if one green bottle should accidentally fall,
There'll be four green bottles hanging on the wall.

Four green bottles hanging on the wall,
Four green bottles hanging on the wall,
And if one green bottle should accidentally fall,
There'll be three green bottles hanging on the wall.

Three green bottles hanging on the wall,
Three green bottles hanging on the wall,
And if one green bottle should accidentally fall,
There'll be two green bottles hanging on the wall.

Two green bottles hanging on the wall,
Two green bottles hanging on the wall,
And if one green bottle should accidentally fall,
There'll be one green bottles hanging on the wall.

One green bottles hanging on the wall,
One green bottles hanging on the wall,
And if one green bottle should accidentally fall,
There'll be no green bottles hanging on the wall.

*/
