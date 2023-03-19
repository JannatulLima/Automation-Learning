package practice.abstraction;

public class FemaleEmployee extends Employee {
    int totalLeaveCountWithMaternity;

    @Override
    public void printEmployeeDetails() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Total Leave: " + totalLeaveCountWithMaternity + " days");
    }
}
