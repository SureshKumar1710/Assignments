package assignmentInheritance;

class Vehicle 
{
    private String brand;
    private int year;

    public Vehicle(String brand, int year) 
    {
        this.brand = brand;
        this.year = year;
    }

    public void displayInfo() 
    {
        System.out.println("Brand: " + brand + "\nYear: " + year);
    }
}

class Car extends Vehicle 
{
    private double mileage;

    public Car(String brand, int year, double mileage) 
    {
        super(brand, year); 
        this.mileage = mileage;
    }

    public void displayInfo() 
    {
        super.displayInfo();
        System.out.println("Mileage: " + mileage + " mpg");
    }
}

class Motorcycle extends Vehicle 
{
    private int engineCapacity; 

    public Motorcycle(String brand, int year, int engineCapacity) 
    {
        super(brand, year);
        this.engineCapacity = engineCapacity;
    }

    public void displayInfo() 
    {
        super.displayInfo();
        System.out.println("Engine Capacity: " + engineCapacity + " cc");
    }
}


public class VehicleHierarchy 
{
   public static void main(String[] args) 
   {
     Vehicle myCar = new Car("Toyota", 2022, 30.5);
     myCar.displayInfo();

     System.out.println();

     Vehicle myMotorcycle = new Motorcycle("Royal Enfield", 2021, 1200);
     myMotorcycle.displayInfo();
   }
}
