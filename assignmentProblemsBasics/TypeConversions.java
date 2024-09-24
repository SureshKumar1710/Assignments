package assignmentProblemsBasics;

public class TypeConversions {
    public static void main(String[] args) {
    	
    	byte byteNum = 69; //Input for type conversion
        char ch = 'A';
        
        short shortNum= byteNum;
        int intNum = shortNum;
        int charToInt=ch;
        long longNum=intNum;
        float floatNum = longNum;
        double doubleNum = floatNum;
        System.out.println("TYPE CONVERSION");
        System.out.println("----------------");
        System.out.println("Byte: "+byteNum);
        System.out.println("Byte to Short: "+byteNum+" -> "+shortNum);
        System.out.println("Short to Int: "+shortNum+" -> "+intNum);
        System.out.println("Character to Int: "+ch+" -> "+charToInt);
        System.out.println("Int to Long: "+intNum+" -> "+longNum);
        System.out.println("Long to Float: "+longNum+" -> "+floatNum);
        System.out.println("Float to Double: "+floatNum+" -> "+doubleNum);
        System.out.println();
        
        double doubleNum2=99.45; // Input for Type casting
        
        System.out.println("TYPE CASTING");
        System.out.println("-------------");
        floatNum=(float) doubleNum2;
        longNum=(long) floatNum;
        intNum=(int) longNum;
        shortNum=(short) intNum;
        byteNum=(byte) shortNum;
        char intToChar=(char)intNum;
        System.out.println("Double: "+doubleNum2);
        System.out.println("Double to Float: "+doubleNum2+" -> "+floatNum);
        System.out.println("Float to Long: "+floatNum+" -> "+longNum);
        System.out.println("Long to Int: "+longNum+" -> "+intNum);
        System.out.println("Int to Character: "+intNum+" -> "+intToChar);
        System.out.println("Int to Short: "+intNum+" -> "+shortNum);
        System.out.println("Short to Byte: "+shortNum+" -> "+byteNum);
	}
}


/*
OUTPUT:
TYPE CONVERSION
----------------
Byte: 69
Byte to Short: 69 -> 69
Short to Int: 69 -> 69
Character to Int: A -> 65
Int to Long: 69 -> 69
Long to Float: 69 -> 69.0
Float to Double: 69.0 -> 69.0

TYPE CASTING
-------------
Double: 99.45
Double to Float: 99.45 -> 99.45
Float to Long: 99.45 -> 99
Long to Int: 99 -> 99
Int to Character: 99 -> c
Int to Short: 99 -> 99
Short to Byte: 99 -> 99
*/ 
