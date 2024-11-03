package assignmentInterface;

import java.util.*;

interface RemoteControlCar 
{
    void drive();
    int getDistanceTravelled();
}


public class RemoteControlCars 
{
    public static void main(String[] args) 
    {
        ProductionRemoteControlCar prod = new ProductionRemoteControlCar();
        prod.drive();
        System.out.println("Production Car Distance: " + prod.getDistanceTravelled()); 

        ExperimentalRemoteControlCar exp = new ExperimentalRemoteControlCar();
        exp.drive();
        System.out.println("Experimental Car Distance: " + exp.getDistanceTravelled());
        TestTrack.race(new ProductionRemoteControlCar());
        TestTrack.race(new ExperimentalRemoteControlCar());

        ProductionRemoteControlCar prc1 = new ProductionRemoteControlCar();
        ProductionRemoteControlCar prc2 = new ProductionRemoteControlCar();
        prc1.setNumberOfVictories(2);
        prc2.setNumberOfVictories(3);

        List<ProductionRemoteControlCar> unsortedCars = new ArrayList<>();
        unsortedCars.add(prc1);
        unsortedCars.add(prc2);

        List<ProductionRemoteControlCar> rankings = TestTrack.getRankedCars(unsortedCars);
        System.out.println("Ranked Cars:");
        for (ProductionRemoteControlCar car : rankings) 
        {
            System.out.println("Victories: " + car.getNumberOfVictories());
        }
    }
}

class TestTrack 
{
    public static void race(RemoteControlCar car) 
    {
        car.drive(); 
    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) 
    {
        Collections.sort(cars); 
        return cars;
    }
}

class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> 
{
    private int distanceTravelled;
    private int numberOfVictories;
    
    public void drive() 
    {
        distanceTravelled += 10; 
    }

    public int getDistanceTravelled() 
    {
        return distanceTravelled;
    }

    public void setNumberOfVictories(int victories) 
    {
        this.numberOfVictories = victories;
    }

    public int getNumberOfVictories() 
    {
        return numberOfVictories;
    }

    public int compareTo(ProductionRemoteControlCar other) 
    {
        return Integer.compare(other.numberOfVictories, this.numberOfVictories); 
    }
}

class ExperimentalRemoteControlCar implements RemoteControlCar 
{
    private int distanceTravelled;

    public void drive() 
    {
        distanceTravelled += 20;
    }

    public int getDistanceTravelled() 
    {
        return distanceTravelled;
    }
}
