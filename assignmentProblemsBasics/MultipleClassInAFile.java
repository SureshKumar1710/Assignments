package assignmentProblemsBasics;

public class MultipleClassInAFile 
{
    public static void main(String[] args) 
    {
	    System.out.println("Main Public Class is executed");
	    DummyClassOne objOne=new DummyClassOne();
	    objOne.printStatement();
	    DummyClassTwo objTwo=new DummyClassTwo();
	    objTwo.printStatement();
	}
}

class DummyClassOne{
	void printStatement(){
		System.out.println("Dummy Class one is executed");
	}
}

class DummyClassTwo{
	void printStatement(){
		System.out.println("Dummy Class two is executed");
	}
}


// Class files for MultipleClassInAFile, DummyClassOne, DummyClassTwo
/*
OUTPUT:

Main Public Class is executed
Dummy Class one is executed
Dummy Class two is executed
*/