/*● Create a class Student in Student.java then add member variables studentName, collegeName of type String
● Add a member variable studentID of type int.
● Make all the member variables as private.
● Add a main method. And print a message “Successful”.
 ● Compile the class
● Run the class (Follow Coding convention)*/
package basics.practice;

import java.util.Scanner;

public  class Student {
    private String StdName;
    private String ClgName;
    private int StdId;

    public Student(String StdName, String ClgName, int StdId) {
        this.StdName = StdName;
        this.ClgName = ClgName;
        this.StdId = StdId;
    }

    public String getStdName() {
        return StdName;
    }

    public void setStdName(String StdName) {

        this.StdName = StdName;
    }

    public String getClgName() {
        return ClgName;
    }

    public void setClgName() {
        this.ClgName = ClgName;
    }

    public int getStdId() {
        return StdId;
    }

    public void setStdId() {
        this.StdId = StdId;
    }

    public static class Main4 {
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter your name: ");
            String StdName=sc.nextLine();
            System.out.print("Enter college name: ");
            String ClgName=sc.nextLine();
            System.out.print("Enter student id: ");
            int StdId=sc.nextInt();
            Student student=new Student(StdName,ClgName,StdId);
            System.out.println(student.getStdName());
            System.out.println(student.getClgName());
            System.out.println(student.getStdName());
            System.out.println();
            System.out.println("Successfull");
        }
    }
}