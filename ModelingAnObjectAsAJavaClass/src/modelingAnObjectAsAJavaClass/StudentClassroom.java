package modelingAnObjectAsAJavaClass;

import java.util.Scanner;

public class StudentClassroom {
    /**
     * @author Murray Milton
     * CMIS 242 7384 Intermediate Programming
     * Week 1 - Modeling an Object as a Java Class
     * File Name : <StudentClassroom.java>
     *
     * Description: The file contains the implementation of an instantiation of a Student Class Object
     */


    public static void main(String[]args){

        //Get the student information
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter studentId:");
        String id = sc.nextLine();
        System.out.println("Enter course:");
        String course = sc.nextLine();
        System.out.println("Enter First Name:");
        String firstName = sc.nextLine();
        System.out.println("Enter Last Name:");
        String lastName = sc.nextLine();

        //Creating an instance of the student object
        Student student1 = new Student(id, course, firstName, lastName);
        student1.setFirstName("Timothy");
        System.out.println(student1.getFirstName());
        System.out.println(student1);
    }
}
