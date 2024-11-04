package assignmentInheritance;

class Student {
    private String name;
    private int age;
    private String address;

    Student(String name, int age) 
    {
        this.name = name;
        this.age = age;
        this.address = "unknown";
    }

    Student(String name, int age, String address) 
    {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() 
    {
        return name;
    }


    public int getAge() 
    {
        return age;
    }

    public String getAddress() 
    {
        return address;
    }

    public void getDetails() 
    {
        System.out.println("\nName: " + getName() +
                           "\nAge: " + getAge() +
                           "\nAddress: " + getAddress());
    }
}

class ZSGSStudent extends Student 
{
    private String course;

    ZSGSStudent(String name, int age, String course) 
    {
        super(name, age);
        this.course = course;
    }

    ZSGSStudent(String name, int age, String course, String address) 
    {
        super(name, age, address); 
        this.course = course;
    }

    public String getCourse() 
    {
        return course;
    }

    public void getDetails() 
    {
        super.getDetails();
        System.out.println("Course: " + getCourse());
    }
}

public class StudentMain
{
	public static void main(String[] args) 
    {
        Student student1 = new ZSGSStudent("Kumar", 22, "Java", "Address");
        student1.getDetails();

        ZSGSStudent student2 = new ZSGSStudent("Prabhu", 23, "Java");
        student2.getDetails();
    }
}
