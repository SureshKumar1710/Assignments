package assignmentMethodOverloading;

public class MathOperation // qn 1
{

    public byte add(byte a, byte b) 
    {
        return (byte) (a + b);
    }

    public short add(short a, short b) 
    {
        return (short) (a + b);
    }

    public int add(int a, int b) 
    {
        return a + b;
    }

    public long add(long a, long b) 
    {
        return a + b;
    }

    public float add(float a, float b) 
    {
        return a + b;
    }

    public double add(double a, double b) 
    {
        return a + b;
    }

    public byte subtract(byte a, byte b) 
    {
        return (byte) (a - b);
    }

    public short subtract(short a, short b) 
    {
        return (short) (a - b);
    }

    public int subtract(int a, int b) 
    {
        return a - b;
    }

    public long subtract(long a, long b) 
    {
        return a - b;
    }

    public float subtract(float a, float b) 
    {
        return a - b;
    }

    public double subtract(double a, double b) 
    {
        return a - b;
    }

    public byte multiply(byte a, byte b) 
    {
        return (byte) (a * b);
    }

    public short multiply(short a, short b) 
    {
        return (short) (a * b);
    }

    public int multiply(int a, int b) 
    {
        return a * b;
    }

    public long multiply(long a, long b) 
    {
        return a * b;
    }

    public float multiply(float a, float b) 
    {
        return a * b;
    }

    public double multiply(double a, double b) 
    {
        return a * b;
    }

    public byte divide(byte a, byte b) 
    {
    	if (b == 0) 
        {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (byte) (a / b);
    }

    public short divide(short a, short b) 
    {
    	if (b == 0) 
        {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (short) (a / b);
    }

    public int divide(int a, int b) 
    {
    	if (b == 0) 
        {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public long divide(long a, long b) 
    {
        if (b == 0) 
        {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public float divide(float a, float b) 
    {
        return a / b;
    }

    public double divide(double a, double b) 
    {
        return a / b;
    }

    public static void main(String[] args) {
        MathOperation mathOps = new MathOperation();
        
        System.out.println("Addition:");
        System.out.println("byte: " + mathOps.add((byte) 10, (byte) 5));
        System.out.println("short: " + mathOps.add((short) 10, (short) 5));
        System.out.println("int: " + mathOps.add(10, 5));
        System.out.println("long: " + mathOps.add(10L, 5L));
        System.out.println("float: " + mathOps.add(10.5f, 5.2f));
        System.out.println("double: " + mathOps.add(10.5, 5.2));

        System.out.println("\nSubtraction:");
        System.out.println("byte: " + mathOps.subtract((byte) 10, (byte) 5));
        System.out.println("short: " + mathOps.subtract((short) 10, (short) 5));
        System.out.println("int: " + mathOps.subtract(10, 5));
        System.out.println("long: " + mathOps.subtract(10L, 5L));
        System.out.println("float: " + mathOps.subtract(10.5f, 5.2f));
        System.out.println("double: " + mathOps.subtract(10.5, 5.2));

        System.out.println("\nMultiplication:");
        System.out.println("byte: " + mathOps.multiply((byte) 10, (byte) 5));
        System.out.println("short: " + mathOps.multiply((short) 10, (short) 5));
        System.out.println("int: " + mathOps.multiply(10, 5));
        System.out.println("long: " + mathOps.multiply(10L, 5L));
        System.out.println("float: " + mathOps.multiply(10.5f, 5.2f));
        System.out.println("double: " + mathOps.multiply(10.5, 5.2));

        System.out.println("\nDivision:");
        System.out.println("byte: " + mathOps.divide((byte) 10, (byte) 2));
        System.out.println("short: " + mathOps.divide((short) 10, (short) 2));
        System.out.println("int: " + mathOps.divide(10, 2));
        System.out.println("long: " + mathOps.divide(10L, 2));
        System.out.println("float: " + mathOps.divide(10.5f, 2.0f));
        System.out.println("double: " + mathOps.divide(10.5, 2.0));
    }
}

