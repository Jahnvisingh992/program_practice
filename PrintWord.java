//.Write a program to print A for Apple,B for Boy,C for cat,D for Dog,E for Elephant using switch case.
package basics.practice;

import java.util.Scanner;

public class PrintWord {
    public static void main(String[]arg){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any Alphabet from A to E: ");
        char choice=scanner.next().charAt(0);
        switch(choice){
            case 'A':
            case 'a':
                System.out.println("A for Apple");
                break;
            case 'B':
            case 'b':
                System.out.println("B for Boy");
                break;
            case 'C':
            case 'c':
                System.out.println("C for Cat");
                break;
            case 'D':
            case 'd':
                System.out.println("D for Dog");
                break;
            case  'E':
            case 'e':
                System.out.println("E for Elephant");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
