package assignmentMethodOverriding;

public class Employee // qn 1
{
	private String name;
    private String employeeId;

    public Employee(String name, String employeeId) 
    {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getEmployeeDetails() 
    {
        return String.format("Employee ID: %s, Name: %s", employeeId, name);
    }
}
