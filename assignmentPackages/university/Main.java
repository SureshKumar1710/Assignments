package university;

import university.students.*;
import university.courses.*;
import university.faculty.*;

import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int choice=0;
        while (choice!=11) 
        {
            System.out.println("\nUniversity Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Add Course");
            System.out.println("3. Add Faculty Member");
            System.out.println("4. Enroll Student in a Course");
            System.out.println("5. Drop Student from a Course");
            System.out.println("6. Assign Faculty to a Course");
            System.out.println("7. Unassign Faculty from a Course");
            System.out.println("8. Display Students");
            System.out.println("9. Display Courses");
            System.out.println("10. Display Faculty Members");
            System.out.println("11. Exit");
            System.out.print("Select an option: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) 
            {
                case 1:
                    System.out.print("Enter Student ID: ");
                    String studentId = sc.nextLine();
                    System.out.print("Enter Student Name: ");
                    String studentName = sc.nextLine();
                    System.out.print("Enter Student Major: ");
                    String studentMajor = sc.nextLine();
                    new Student(studentId, studentName, studentMajor);
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    System.out.print("Enter Course ID: ");
                    String courseId = sc.nextLine();
                    System.out.print("Enter Course Name: ");
                    String courseName = sc.nextLine();
                    System.out.print("Enter Course Credits: ");
                    int courseCredits = sc.nextInt();
                    sc.nextLine(); 
                    new Course(courseId, courseName, courseCredits);
                    System.out.println("Course added successfully!");
                    break;

                case 3:
                    System.out.print("Enter Faculty ID: ");
                    String facultyId = sc.nextLine();
                    System.out.print("Enter Faculty Name: ");
                    String facultyName = sc.nextLine();
                    System.out.print("Enter Faculty Department: ");
                    String facultyDepartment = sc.nextLine();
                    new Faculty(facultyId, facultyName, facultyDepartment);
                    System.out.println("Faculty member added successfully!");
                    break;

                case 4:
                    System.out.print("Enter Student ID to enroll: ");
                    studentId = sc.nextLine();
                    System.out.print("Enter Course ID to enroll in: ");
                    courseId = sc.nextLine();
                    Student student = Student.findById(studentId);
                    Course course = Course.findById(courseId);

                    if (student != null && course != null) 
                    {
                        student.enrollCourse(courseId);
                        course.addStudent(studentId);
                        System.out.println("Student enrolled in course successfully!");
                    } 
                    else 
                    {
                        System.out.println("Invalid Student or Course ID.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Student ID to drop: ");
                    studentId = sc.nextLine();
                    System.out.print("Enter Course ID to drop from: ");
                    courseId = sc.nextLine();
                    student = Student.findById(studentId);
                    course = Course.findById(courseId);

                    if (student != null && course != null) 
                    {
                        student.dropCourse(courseId);
                        course.removeStudent(studentId);
                        System.out.println("Student dropped from course successfully!");
                    } 
                    else 
                    {
                        System.out.println("Invalid Student or Course ID.");
                    }
                    break;

                case 6:
                    System.out.print("Enter Faculty ID to assign: ");
                    facultyId = sc.nextLine();
                    System.out.print("Enter Course ID to assign to: ");
                    courseId = sc.nextLine();
                    Faculty faculty = Faculty.findById(facultyId);
                    course = Course.findById(courseId);

                    if (faculty != null && course != null) 
                    {
                        faculty.assignCourse(courseId);
                        System.out.println("Faculty assigned to course successfully!");
                    } 
                    else 
                    {
                        System.out.println("Invalid Faculty or Course ID.");
                    }
                    break;

                case 7:
                    System.out.print("Enter Faculty ID to unassign: ");
                    facultyId = sc.nextLine();
                    System.out.print("Enter Course ID to unassign from: ");
                    courseId = sc.nextLine();
                    faculty = Faculty.findById(facultyId);
                    course = Course.findById(courseId);

                    if (faculty != null && course != null) 
                    {
                        faculty.unassignCourse(courseId);
                        System.out.println("Faculty unassigned from course successfully!");
                    } 
                    else 
                    {
                        System.out.println("Invalid Faculty or Course ID.");
                    }
                    break;

                case 8:
                    Student.display();
                    break;

                case 9:
                    Course.display();
                    break;

                case 10:
                    Faculty.display();
                    break;

                case 11:
                    System.out.println("EXIT");
                    sc.close();

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
