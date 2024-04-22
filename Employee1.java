/*● Create a new class Employee
● Add member variables: id and age of type int, name of type String and isPermanent of type boolean
● Now assign values 35.5 to age; See the error message.
 ● How can you avoid this error? Correct the error by casting.
● Make all the members protected
● Add a main method to it. Print message “Successfully started”.
● Compile the class.*/
package basics.practice;

public class Employee1 {
    protected int id;
    protected String name;
    protected int age;
    protected boolean isPermanent;
    public static void main(String[]args){
        System.out.println("Successfull");
        Employee1 employee1=new Employee1();
      //employee1.age=35.5;
        employee1.age=(int)35.5;
        System.out.println("Employee age: " + employee1.age);
    }
}
