package assignmentConstructors;

public class Employee // qn 2
{
    private String name;
    private String employeeId;
    private String department;
    private String designation;
    private double salary;

    private static int totalEmployees = 0;
    private final static String organizationName="ZOHO";
   
    public Employee(String name, String employeeId, String department, String designation, double salary) 
    {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
        totalEmployees++; 
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getEmployeeId() 
    {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) 
    {
        this.employeeId = employeeId;
    }

    public String getDepartment() 
    {
        return department;
    }

    public void setDepartment(String department) 
    {
        this.department = department;
    }

    public String getDesignation() 
    {
        return designation;
    }

    public void setDesignation(String designation) 
    {
        this.designation = designation;
    }

    public double getSalary() 
    {
        return salary;
    }

    public void setSalary(double salary) 
    {
        this.salary = salary;
    }

    public static int getTotalEmployees() 
    {
        return totalEmployees;
    }

	public static String getOrganizationName() 
	{
		return organizationName;
	}
}


