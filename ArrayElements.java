//Write a program to print 5 array elements using scanner
package basics.practice;

import java.util.Scanner;

public class ArrayElements {
   public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       int[]arr=new int[5];
       System.out.println("Enter five numbers: ");
       for (int i=0; i<5; i++){
           arr[i]= sc.nextInt();
       }
       System.out.println("The elements are: ");
       for (int i=0; i<5; i++){
           System.out.println(arr[i]);
       }
   }
}
