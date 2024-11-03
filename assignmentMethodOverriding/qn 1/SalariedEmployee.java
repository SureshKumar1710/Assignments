package assignmentMethodOverriding;

public class SalariedEmployee extends Employee // qn 1
{
    private double annualSalary;

    public SalariedEmployee(String name, String employeeId, double annualSalary) 
    {
        super(name, employeeId);
        this.annualSalary = annualSalary;
    }

    public String getEmployeeDetails() 
    {
        return String.format("%s, Annual Salary: %.2f", super.getEmployeeDetails(), annualSalary);
    }
}
