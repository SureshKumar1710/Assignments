package assignmentMethodOverriding;

public class EmployeeMain // qn 1
{
	public static void main(String[] args) 
	{
        Employee emp1 = new HourlyEmployee("Suresh", "E001", 25.0, 40);
        Employee emp2 = new SalariedEmployee("Ramesh", "E002", 60000.0);
        
        System.out.println(emp1.getEmployeeDetails());
        System.out.println(emp2.getEmployeeDetails());
    }
}

/*
OUTPUT

Employee ID: E001, Name: Suresh, Hourly Rate: 25.00, Hours Worked: 40, Salary: 1000.00
Employee ID: E002, Name: Ramesh, Annual Salary: 60000.00

*/