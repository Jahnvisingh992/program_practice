//● Write a Java program that demonstrates method overloading by creating a class called Calculator.
// ● Add three methods called add().
// ● The first add() method should take two int variables as arguments and return their sum as int.
// ● The second add() method should take three int variables as arguments and return their sum as int.
// ● The third add() method should take two doubles as arguments and return their sum as double.
// ● The program should allow the user to display the results of each method.
package basics.practice;

public class Calculator {
    public int add(int n1,int n2){
        return n1+n2;
    }
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public double add(double n1,double n2){
        return n1+n2;
    }

    public static class Main7 {
        public static void main(String[]args){
            Calculator calculator=new Calculator();
            int sum1= calculator.add(5,10);
            System.out.println("Sum of 5 nd 10: " + sum1);
            int sum2= calculator.add(15,20,25);
            System.out.println("Sum of 15,20 nd 25: " + sum2);
            double sum3= calculator.add(5.5,4.4);
            System.out.println("Sum of 5.5 nd 4.4: " + sum3);
        }
    }
}
