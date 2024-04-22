//● Create a Java Bean Class Student.
// ● Add three attributes ○ private String name; ○ private int age; ○ private String department;
// ● Add a constructor that takes all three attributes as parameters.
// ● Add setter and getter methods
// ● C o m pile the program
package basics.practice;

public class Student1 {
    private String name;
    private int age;
    private String department;
    public Student1(String name,int age,String department){
        this.name=name;
        this.age=age;
        this.department=department;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department=department;
    }

    public static class Main6 {
        public static void main(String[]args){
            Student1 student = new Student1("Jahnvi", 21, "B.C.A");
            System.out.println("Student name is: " + student.getName());
            System.out.println("Student age is: " + student.getAge());
            System.out.println("Department name is:" + student.getDepartment());
        }
    }
}
