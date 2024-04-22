package basics.practice;

import java.util.Scanner;

public class StrongNumber {
    static int factorial(int n){
        if (n==0)
            return 1;
        else
            return (n*factorial(n-1));
    }
    static boolean isStrong(int num){
        int originalNum=num;
        int sum=0;
        while (num>0){
            int digit=num%10;
            sum+=factorial(digit);
            num/=10;
        }
        return sum ==originalNum;
    }
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        if (isStrong(num))
            System.out.println(num +" is a strong number");
        else
            System.out.println(num +" is not a strong number");
    }
}
