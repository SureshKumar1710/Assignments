package university.students;

import java.util.ArrayList;

public class Student 
{
    private static ArrayList<Student> students = new ArrayList<>(); 

    private String studentId;
    private String name;
    private String major;
    private ArrayList<String> enrolledCourses;

    public Student(String studentId, String name, String major) 
    {
        this.studentId = studentId;
        this.name = name;
        this.major = major;
        this.enrolledCourses = new ArrayList<>();
        students.add(this); 
    }

    public String getStudentId() 
    {
        return studentId;
    }

    public static void addStudent(Student student) 
    {
        students.add(student);
    }

    public void enrollCourse(String courseId) 
    {
        enrolledCourses.add(courseId);
    }

    public void dropCourse(String courseId) 
    {
        enrolledCourses.remove(courseId);
    }

    public static Student findById(String studentId) 
    {
        for (Student student : students) 
        {
            if (student.getStudentId().equals(studentId)) 
            {
                return student;
            }
        }
        return null;
    }

    public static void display() 
    {
        System.out.println("List of Students:");
        for (Student student : students) 
        {
            System.out.println("ID: " + student.studentId + ", Name: " + student.name + ", Major: " + student.major);
        }
    }
}
