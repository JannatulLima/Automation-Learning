//5th assignment, item -2 (0 practice.abstraction)
package practice.abstraction;

public abstract class Employee {
    String employeeName;
    int employeeId;
    int employeeSalary;

    public void printEmployeeDetails() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID: " + employeeId);
    }

    public void printConfidentialDetails() {
        System.out.println("Employee Salary: " + employeeSalary + "K");
    }
}
