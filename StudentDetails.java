//write a program to print the students details(stdid,stdname,stdmark) using array elements
package basics.practice;

import java.util.Scanner;

public class StudentDetails {
   public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of students : ");
        int numStudents = sc.nextInt();
        int[] studentIds = new int[numStudents];
        String[] studentNames= new String[numStudents];
        double[] studentMarks= new double[numStudents];
        for (int i=0; i<numStudents; i++){
            System.out.println("\tEnter details for student " + (i+1) + ":-");
            System.out.print("\tID: ");
            studentIds[i]= sc.nextInt();
            sc.nextLine();
            System.out.print("\tName: ");
            studentNames[i]= sc.nextLine();
            System.out.print("\tMarks: ");
            studentMarks[i]= sc.nextDouble();
        }
        System.out.println("\t\tStudent Details: ");
        System.out.println("ID\t\t Name \t\tMark");
        for (int i=0; i<numStudents; i++){
            System.out.println(studentIds[i] + "\t\t " + studentNames[i] + "\t\t " + studentMarks[i]);
        }
    }
}
/*----------------------------------------------------------------------------------------------------------*/
//2nd approch by using setter nd getter method to achieve encapsulation
public class Students {
    int stdId;
    String stdName;
    float stdMarks;
    public int getStdId() {
        return stdId;
    }
    public void setStdId(int stdId) {
        this.stdId = stdId;
    }
    public String getStdName() {
        return stdName;
    }
    public void setStdName(String stdName) {
        this.stdName = stdName;
    }
    public float getStdMarks() {
        return stdMarks;
    }
    public void setStdMarks(float stdMarks) {
        this.stdMarks = stdMarks;
    }

    @Override
    public String toString() {
        return "StudentDetails{" +
                "stdId=" + stdId +
                ", stdName='" + stdName + '\'' +
                ", stdMarks=" + stdMarks +
                '}';
    }


    }

    public static void main(String[] args) {
        Students students[] = new Students[5];
        Scanner sc = new Scanner(System.in);
//		Taking inputs from user
        System.out.println("Enter Student Details:-");
        for (int i = 0; i < 5; i++) {
            Students std= new Students();
            System.out.print("Enter Student Id: ");
            int stdId = sc.nextInt();
            sc.nextLine();

            std.setStdId(stdId);
            System.out.print("Enter Student Name: ");
            String stdName = sc.nextLine();
            std.setStdName(stdName);
            System.out.print("Enter Student Marks: ");
            float stdMarks = sc.nextFloat();
            std.setStdMarks(stdMarks);
            students[i] = std;


        }
        System.out.println("\t\tStudent Details ");
        for (int i=0; i<2; i++) {
            System.out.println(students[i]);

        }

    }

}





