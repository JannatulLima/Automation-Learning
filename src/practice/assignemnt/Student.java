// ********** 4th assignment, item -1 **********
package practice.assignemnt; //package naming convention

public class Student { //class naming convention
    String studentName; //variable naming convention
    String universityName;
    static final int DAILY_MAX_CLASS_COUNT = 5; //constant naming convention

    public void printStudentDetails() { //method naming convention
        System.out.println("========== Student Details ==========");
        System.out.println("Student Name: " + studentName);
        System.out.println("University Name: " + universityName);
    }

    public void printCourseDetails() {
        System.out.println("========== Course Details ==========");
        System.out.println("Maximum " + DAILY_MAX_CLASS_COUNT + " classes can be taken in a day!");
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.studentName = "Jannatul";
        student.universityName = "AIUB";
        System.out.println();
        student.printStudentDetails();
        System.out.println();
        student.printCourseDetails();
    }
}
