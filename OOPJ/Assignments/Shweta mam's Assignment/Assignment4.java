import java.util.Scanner;

class Employee {

    private String name;
    private int age;
    private int empId;
    private float salary;

    void acceptRecord() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Age: ");
        age = sc.nextInt();

        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();

        System.out.print("Enter Salary: ");
        salary = sc.nextFloat();
    }


    void printRecord() {
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
    }
}

public class Assignment4 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.acceptRecord();
        emp.printRecord();
    }
}
