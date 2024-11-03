package assignmentMethodOverriding;

class Vehicle // qn 2
{
    private String brand;
    private String model;

    public Vehicle(String brand, String model) 
    {
        this.brand = brand;
        this.model = model;
    }

    public void start() 
    {
        System.out.println("The vehicle is starting.");
    }

    public void stop() 
    {
        System.out.println("The vehicle is stopping.");
    }

    public String getDetails() 
    {
        return String.format("Brand: %s, Model: %s", brand, model);
    }
}

class Car extends Vehicle 
{
    public Car(String brand, String model) 
    {
        super(brand, model);
    }

    public void start() 
    {
        System.out.println("The Car starts!");
    }

    public void stop() 
    {
        System.out.println("The Car stops!");
    }
}

class Bike extends Vehicle 
{
    public Bike(String brand, String model) 
    {
        super(brand, model);
    }

    public void start() 
    {
        System.out.println("The Bike starts!");
    }

    public void stop() 
    {
        System.out.println("The Bike stops!");
    }
}

public class VehilcleHierarchy 
{
   public static void main(String[] args) 
   {
	   
	 Vehicle myVehicle=new Vehicle("Brand","Model");
     Vehicle myCar = new Car("Mercedes", "Benz C Class");
     Vehicle myMotorcycle = new Bike("Royal Enfield", "Classic 360");

     System.out.println(myVehicle.getDetails());
     myVehicle.start();
     myVehicle.stop();

     System.out.println();
     
     System.out.println(myCar.getDetails());
     myCar.start();
     myCar.stop();

     System.out.println();

     System.out.println(myMotorcycle.getDetails());
     myMotorcycle.start();
     myMotorcycle.stop();
   }
}
