package practice.inheritance;

public class FemaleEmployee extends Employee {  //single practice.inheritance
    int maternityLeave;
    int totalLeaveCountIncludingMaternity;

    public void printTotalLeaveCountIncludingMaternity(){
        totalLeaveCountIncludingMaternity = totalLeaveCountExcludingMaternityPaternity + maternityLeave;
        System.out.println("Total leave (including Maternity): " + totalLeaveCountIncludingMaternity + " days");
    }

    public static void main(String[] args) {
        FemaleEmployee femaleEmployee = new FemaleEmployee();
        femaleEmployee.name = "Rahela";
        femaleEmployee.designation = "SQA";
        femaleEmployee.salary = 80000;
        femaleEmployee.totalWorkingHour = 8;
        femaleEmployee.lunchBreak = 2;
        femaleEmployee.totalLeaveCountExcludingMaternityPaternity = 40;
        femaleEmployee.maternityLeave = 120;
        femaleEmployee.printEmployeeDetails();
        System.out.println();
        femaleEmployee.printWorkingHourDetails();
        System.out.println();
        femaleEmployee.printLeaveDetails();
        femaleEmployee.printTotalLeaveCountIncludingMaternity();
    }
}
