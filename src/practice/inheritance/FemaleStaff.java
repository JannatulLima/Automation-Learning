package practice.inheritance;

public class FemaleStaff extends FemaleEmployee {  //multilevel Inheritance
    public static void main(String[] args) {
        FemaleStaff femaleStaff = new FemaleStaff();
        femaleStaff.name= "Hawa Bibi";
        femaleStaff.salary = 20000;
        femaleStaff.designation = "Kitchen Hanlder";
        femaleStaff.totalWorkingHour = 4;
        femaleStaff.lunchBreak = 2;
        femaleStaff.totalLeaveCountExcludingMaternityPaternity = 40;
        femaleStaff.maternityLeave = 120;
        femaleStaff.printEmployeeDetails();
        System.out.println();
        femaleStaff.printWorkingHourDetails();
        System.out.println();
        femaleStaff.printLeaveDetails();
        femaleStaff.printTotalLeaveCountIncludingMaternity();
    }
}
