import java.util.Scanner;
import java.util.Arrays;

class Employee {
    int id;
    String name;
    int age;
    double salary;

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee[] employees = new Employee[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter ID for employee " + (i+1) + ": ");
            int id = input.nextInt();
            System.out.print("Enter name for employee " + (i+1) + ": ");
            String name = input.next();
            System.out.print("Enter age for employee " + (i+1) + ": ");
            int age = input.nextInt();
            System.out.print("Enter salary for employee " + (i+1) + ": ");
            double salary = input.nextDouble();

            employees[i] = new Employee(id, name, age, salary);
        }

        Arrays.sort(employees, (e1, e2) -> e1.age - e2.age);

        for (Employee e : employees) {
            System.out.println("Name: " + e.name + ", Age: " + e.age);
        }
    }
}