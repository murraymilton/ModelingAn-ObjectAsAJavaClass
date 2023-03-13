package modelingAnObjectAsAJavaClass;

import java.util.Scanner;

public class Student {

    private String id;
    private String course;
    private String firstName;
    private String lastName;

    /**
     *  <Student - class constructor>
     * @param id
     * @param course
     * @param firstName
     * @param lastName
     *
     * <This method is the class constructor.
     */
    public Student(String id, String course, String firstName, String lastName){
        this.id = id;
        this.course = course;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Accessor and mutator methods ---> Getter and Setters
     * @return
     */
    public String getId() {
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course){
        this.course = course;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    // Instance method
//    public void addStudentInfo(){
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter studentId:");
//        id = sc.nextLine();
//        System.out.println("Enter course:");
//        course = sc.nextLine();
//        System.out.println("Enter student First Name:");
//        firstName = sc.nextLine();
//        System.out.println("Enter student Last Name:");
//        lastName=sc.nextLine();
//        sc.close();
//    }

    /**
     * <toString method for the object
     * @return --> String representation of the object instance
     */
    public String toString(){
        return "StudentID:" + id + "\nCourse:" + course +
                "\nFirst Name:" + firstName + " \nLast Name:" + lastName;
    }
}
