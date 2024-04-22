//.Using for loop  statement, print the even and odd number between 100 to 300
package basics.practice;

public class FindEvenOdd {
    public static void main(String[]args){
        System.out.println("Even no. between 100 nd 300: ");
        for (int i=100;i<=300;i++){
            if (i%2==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Odd no. between 100 nd 300: ");
        for (int i=100;i<=300;i++){
            if (i%2!=0){
                System.out.print(i + " ");
            }
        }
    }
}
