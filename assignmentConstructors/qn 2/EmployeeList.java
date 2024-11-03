package assignmentConstructors;

import java.util.*;

public class EmployeeList { // qn 2

    private List<Employee> employees;

    public EmployeeList() 
    {
        employees = new ArrayList<>();
    }

    public void addEmployee(String name, String employeeId, String department, String designation, double salary) 
    {
        Employee employee = new Employee(name, employeeId, department, designation, salary);
        employees.add(employee);
        System.out.println("Employee added successfully!\n");
    }

    public void displayEmployees() 
    {
        for (Employee employee : employees) 
        {
            System.out.println("Name: " + employee.getName());
            System.out.println("Employee ID: " + employee.getEmployeeId());
            System.out.println("Department: " + employee.getDepartment());
            System.out.println("Designation: " + employee.getDesignation());
            System.out.println("Salary: Rs. " + employee.getSalary());
            System.out.println();
        }
        System.out.println("Total Employees: " + Employee.getTotalEmployees());
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        EmployeeList employeeList = new EmployeeList();
        int choice = 0;
        
        while (choice != 3) {
            System.out.println("MENU");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Exit");
            System.out.print("Your choice: ");
            choice = sc.nextInt();
            
            switch (choice) 
            {
                case 1:
                    System.out.print("Enter Employee Name: ");
                    sc.nextLine(); 
                    String name = sc.nextLine();
                    
                    System.out.print("Enter Employee ID: ");
                    String employeeId = sc.next();
                    
                    System.out.print("Enter Department: ");
                    sc.nextLine();
                    String department = sc.nextLine();
                    
                    System.out.print("Enter Designation: ");
                    String designation = sc.nextLine();
                    
                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();
                    System.out.println();
                    
                    employeeList.addEmployee(name, employeeId, department, designation, salary);
                    break;
                
                case 2:
                    System.out.println();
                    employeeList.displayEmployees();
                    break;
                
                case 3:
                    System.out.println("EXIT");
                    break;
                
                default:
                    System.out.println("No such option. Please choose again.\n");
            }
        }
        sc.close();
    }
}
