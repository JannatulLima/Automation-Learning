package practice.inheritance;

public class MaleEmployee extends Employee {  //Hierarchy Inheritance
    int paternityLeave;
    int totalLeaveCountIncludingPaternity;

    public void printTotalLeaveCountIncludingPaternity(){
        totalLeaveCountIncludingPaternity = totalLeaveCountExcludingMaternityPaternity + paternityLeave;
        System.out.println("Total leave (including Paternity): " + totalLeaveCountIncludingPaternity + " days");
    }
    public static void main(String[] args) {
        MaleEmployee maleEmployee = new MaleEmployee();
        maleEmployee.name = "Asif";
        maleEmployee.designation = "Software Engineer";
        maleEmployee.salary = 90000;
        maleEmployee.totalWorkingHour = 8;
        maleEmployee.lunchBreak = 2;
        maleEmployee.totalLeaveCountExcludingMaternityPaternity = 40;
        maleEmployee.paternityLeave = 7;
        maleEmployee.printEmployeeDetails();
        System.out.println();
        maleEmployee.printWorkingHourDetails();
        System.out.println();
        maleEmployee.printLeaveDetails();
        maleEmployee.printTotalLeaveCountIncludingPaternity();
    }
}
