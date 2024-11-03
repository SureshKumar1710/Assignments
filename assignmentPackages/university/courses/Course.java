package university.courses;

import java.util.ArrayList;

public class Course 
{
    private static ArrayList<Course> courses = new ArrayList<>(); 

    private String courseId;
    private String name;
    private int credits;
    private ArrayList<String> enrolledStudents;

    public Course(String courseId, String name, int credits) 
    {
        this.courseId = courseId;
        this.name = name;
        this.credits = credits;
        this.enrolledStudents = new ArrayList<>();
        courses.add(this);
    }

    public String getCourseId() 
    {
        return courseId;
    }

    public void addStudent(String studentId) 
    {
        enrolledStudents.add(studentId);
    }

    public void removeStudent(String studentId) 
    {
        enrolledStudents.remove(studentId);
    }

    public static Course findById(String courseId) 
    {
        for (Course course : courses) 
        {
            if (course.getCourseId().equals(courseId)) 
            {
                return course;
            }
        }
        return null;
    }

    public static void display() 
    {
        System.out.println("List of Courses:");
        for (Course course : courses) 
        {
            System.out.println("ID: " + course.courseId + ", Name: " + course.name + ", Credits: " + course.credits);
        }
    }
}
