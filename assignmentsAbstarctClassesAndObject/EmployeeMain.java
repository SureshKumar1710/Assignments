package assignmentsAbstarctClassesAndObject;

import java.util.*;

abstract class Employee 
{
    protected String name;
    protected int id;
    public Employee(String name, int id) 
    {
        this.name = name;
        this.id = id;
    }

    public String getEmployeeDetails() 
    {
        return "ID: " + id + ", Name: " + name;
    }

    public abstract double calculatePay();
}

class HourlyEmployee extends Employee 
{
    private double hourlyRate;
    private int hoursWorked;

    public HourlyEmployee(String name, int id, double hourlyRate, int hoursWorked) 
    {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculatePay() 
    {
        return hourlyRate * hoursWorked;
    }
}

class SalariedEmployee extends Employee 
{
    private double monthlySalary;

    public SalariedEmployee(String name, int id, double monthlySalary) 
    {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    public double calculatePay() 
    {
        return monthlySalary*12;
    }
}

public class EmployeeMain 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
		Employee employee = null;
		int choice=0,id=0;
		String name;
		while(choice!=3) 
		{
			System.out.printf("MENU\n1.Hourly Employee\n2.Salaried Employee\n3.Exit\nYour Choice: ");
			
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter the Name : ");
				name = sc.nextLine();
				System.out.println("Enter the Id : ");
				id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter the hourly Pay : ");
				double hourlyPay = sc.nextDouble();
				System.out.println("Enter the hours Worked : ");
				int hoursWorked = sc.nextInt();
				employee = new HourlyEmployee(name,id,hourlyPay,hoursWorked); 
				break;
			case 2:
				System.out.println("Enter the Name : ");
				name = sc.nextLine();
				System.out.println("Enter the Id : ");
				id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter the Monthly Salary");
				double monthlySalary = sc.nextDouble();
				employee = new SalariedEmployee(name,id,monthlySalary);
				break;
			case 3:
				System.out.println("EXIT");
				break;
			default:
				System.out.println("Invalid choice!");
			}
			System.out.println(employee.getEmployeeDetails());
			System.out.println("Calculated Pay : "+employee.calculatePay());
			System.out.println("\n");
		}
		sc.close();
	}

}
