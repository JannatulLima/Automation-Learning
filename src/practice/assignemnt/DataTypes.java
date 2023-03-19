package practice.assignemnt;

public class DataTypes {
    int registeredCourses = 4;
    double courseOnePoint = 98.03;
    float courseTwoPoint = 99.65f;
    short courseThreePoint = 99;
    byte courseFourPoint = 100;
    String firstname = "Jannatul";
    char varsityName[] = {'A', 'I', 'U', 'B'};
    boolean compareCoursePoints;

    public void printStudentDetails(){
        System.out.println("Student Name: " + firstname);
        System.out.print("University: ");
        for (char c: varsityName){
            System.out.print(c);
        }
        System.out.println("\nRegistered course count: " + registeredCourses);
    }

    public void printCoursePoints(){
        System.out.println("Course 1 mark: " + courseOnePoint);
        System.out.println("Course 2 mark: " + courseTwoPoint);
        System.out.println("Course 3 mark: " + courseThreePoint);
        System.out.println("Course 4 mark: " + courseFourPoint);
    }

    public void compareCourses(){
        System.out.println(firstname + " achieved more mark in course 1 than course 2, Is this statement true? Let's check!!");
        compareCoursePoints = courseOnePoint > courseTwoPoint;
        System.out.println("Statement is " + compareCoursePoints);
    }

    public static void main(String[] args) {
        DataTypes datatype = new DataTypes();
        System.out.println("\n" + "***********  Student Details  ***********");
        datatype.printStudentDetails();
        System.out.println("\n" + "***********  Student Course Marks  ***********");
        datatype.printCoursePoints();
        System.out.println("\n" + "***********  Marks Comparion Details  ***********");
        datatype.compareCourses();
    }

}
