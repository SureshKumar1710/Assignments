package assignmentMethodOverriding;

public class HourlyEmployee extends Employee // qn 1
{
	private double hourlyRate;
    private int hoursWorked;
    private double salary;

    public HourlyEmployee(String name, String employeeId, double hourlyRate, int hoursWorked) 
    {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.salary= hourlyRate * hoursWorked;
    }

    public String getEmployeeDetails() 
    {
        return String.format("%s, Hourly Rate: %.2f, Hours Worked: %d, Salary: %.2f", super.getEmployeeDetails(), hourlyRate, hoursWorked,salary);
    }
}
