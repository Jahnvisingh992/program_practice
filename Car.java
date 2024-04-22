// ● Write a Java program named Car
// ● The Car class should have the following attributes: make (String), model (String) , year (short) , and price(int) .
// ● The car class should have a constructor that takes all the attributes.
// ● Add a main method to instantiate car objects.
// ● The program should allow the user to create and display objects of each Car Class.
package basics.practice;

import java.util.Scanner;

public class Car {
    private String make;
    private String model;
    private short year;
    private int price;
    public Car(String make,String model,short year,int price){
        this.make=make;
        this.model=model;
        this.year=year;
        this.price=price;
    }

    public static class Main5 {
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter make of the car - ");
            String make= sc.nextLine();
            System.out.print("Enter model of the car - ");
            String model= sc.nextLine();
            System.out.print("Enter year of the car - ");
            short year= sc.nextShort();
            System.out.print("Enter price of the car - ");
            int price= sc.nextInt();
            Car car = new Car(make,model,year,price);
            System.out.println("Car Details: ");
            System.out.println("Make: " + make);
            System.out.println("Model: " + model);
            System.out.println("Year: " + year);
            System.out.println("Price: " + price);
        }
    }
}
