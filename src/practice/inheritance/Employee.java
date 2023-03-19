// ********** 4th assignment, item -2 **********

package practice.inheritance;

public class Employee {
    String name;
    String designation;
    int salary;
    int totalWorkingHour;
    int lunchBreak;
    int totalLeaveCountExcludingMaternityPaternity = 120;

    public void printEmployeeDetails(){
        System.out.println("========== Employee Details ==========");
        System.out.println("Employee Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary + "K");
    }

    public void printWorkingHourDetails(){
        System.out.println("========== Employee's Working Hour Details ==========");
        System.out.println("Total Working Hour: " + totalWorkingHour + " hours");
        System.out.println("Lunch Break: " + lunchBreak + " hours");
    }

    public void printLeaveDetails(){
        System.out.println("========== Employee's Leave Details ==========");
        System.out.println("Total Leave (excluding Maternity / Paternity): " + totalLeaveCountExcludingMaternityPaternity + " days");
    }
}
