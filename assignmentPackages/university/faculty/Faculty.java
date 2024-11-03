package university.faculty;

import java.util.ArrayList;

public class Faculty {
    private static ArrayList<Faculty> faculties = new ArrayList<>();

    private String facultyId;
    private String name;
    private String department;
    private ArrayList<String> assignedCourses;

    public Faculty(String facultyId, String name, String department) 
    {
        this.facultyId = facultyId;
        this.name = name;
        this.department = department;
        this.assignedCourses = new ArrayList<>();
        faculties.add(this);
    }

    public String getFacultyId() 
    {
        return facultyId;
    }

    public void assignCourse(String courseId) 
    {
        assignedCourses.add(courseId);
    }

    public void unassignCourse(String courseId) 
    {
        assignedCourses.remove(courseId);
    }

    public static Faculty findById(String facultyId) 
    {
        for (Faculty faculty : faculties) 
        {
            if (faculty.getFacultyId().equals(facultyId)) 
            {
                return faculty;
            }
        }
        return null;
    }

    public static void display() 
    {
        System.out.println("List of Faculty Members:");
        for (Faculty faculty : faculties) 
        {
            System.out.println("ID: " + faculty.facultyId + ", Name: " + faculty.name + ", Department: " + faculty.department);
        }
    }
}
