//.Write a program to display the student details(Average>70,Age>21) using if else(Satisfying both condition)
package basics.practice;
import java.util.Scanner;

public class StudentDetail {
    public static void main(String[]args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.print("\tEnter the name of student : ");
            String name = sc.nextLine();
            System.out.print("\tEnter age of student : ");
            int age = sc.nextInt();
            System.out.print("\tEnter the marks of student :");
            int[] marks = new int[5];
            int sum = 0;
            for(int i=0; i<5;i++)
            {
                marks[i] = sc.nextInt();
                sum = sum + marks[i];
            }
            double average = sum / 5;
            if(average>70 && age>21)
            {
                System.out.println();
                System.out.println("\t\t\tSTUDENT DETAILS : ");
                System.out.println("\t\t\t===================");
                System.out.println();
                System.out.println("\tStudent Name				:	"+name);
                System.out.println("\tStudent Age				:	"+age);
                System.out.println("\tStudents Average Marks			:	"+average);
            }
            else
            {
                System.out.println("\t\tCondition not satisfying...");
            }
        }
    }


