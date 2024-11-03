package assignmentMethodOverloading;

public class PersonMain // qn 2
{
	public static void main(String[] args) 
	{
        Person person1 = new Person("Suresh");
        Person person2 = new Person("Ramesh", 30);
        Person person3 = new Person("Dinesh", 25, "Chennai");

        System.out.println("Details of Person 1:");
        person1.displayDetails();

        System.out.println("Details of Person 2:");
        person2.displayDetails();

        System.out.println("Details of Person 3:");
        person3.displayDetails();
    }
}
