/*Create a program to calculate the annual salary of an employee by using inheritance. Create a class named "User" with the following properties and methods:
Properties: id(int): representing the id of the User name(String):representing the name of the User Constructor:
 Declare parameterized constructor to initialize id and name. Create a subclass named "Employee" that inherits from the "User" class.
 Add the following additional properties and methods: Properties: salary(double):representing the monthly salary of the employee Method: double calculateAnnualSalary():to calculate the annual salary earned by the employee.
 In the main method, create an object of "Employee" class. Calculate the annual salary of the employee and display it.. [Hint:Use constructor or setter methods to set the value]*/
package basics.practice;

public class User {
    int id;
    String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    static class Employee extends User {
        double salary;

        public Employee(int id, String name, double salary) {
            super(id, name);
            this.salary = salary;
        }

        public double calculateAnnualSalary() {
            return salary * 12;
        }
    }

    public static class Main3 {
        public static void main(String[] args) {
            Employee employee = new Employee(101, "Jahnvi", 10000);
            double annualSalary = employee.calculateAnnualSalary();
            System.out.println("The annual salary of " + employee.name + " is " + annualSalary);
        }
    }
}
