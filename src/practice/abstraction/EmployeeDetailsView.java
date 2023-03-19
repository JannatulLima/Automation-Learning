package practice.abstraction;

public class EmployeeDetailsView {
    public static void main(String[] args) {
        FemaleEmployee femaleEmployee = new FemaleEmployee();
        femaleEmployee.employeeName = "Rahela";
        femaleEmployee.employeeId = 3322;
        femaleEmployee.totalLeaveCountWithMaternity = 120;
        femaleEmployee.employeeSalary = 80000;
        System.out.println("========== Employee Details ==========");
        femaleEmployee.printEmployeeDetails();
        System.out.println("\n"+ "========== ALERT!! CONFIDENTIAL INFORMATION ==========");
        femaleEmployee.printConfidentialDetails();
    }
}
