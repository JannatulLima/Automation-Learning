//3rd assignment, item -2
package practice.assignemnt;

public class Students {
    String name;
    String courseName;
    String universityName;

    public Students(){
        System.out.println("========== Student Details ==========");
    }

    public Students(String name, String courseName){
        this.name = name;
        this.courseName = courseName;
    }

    public Students(String name, String courseName, String universityName){
        this.name = name;
        this.courseName = courseName;
        this.universityName = universityName;
    }

    public void printName(){
        System.out.println("Teacher Name: "+ name);
    }

    public void printCourseName(){
        System.out.println("Course Name: "+ courseName);
    }

    public void printUniversityName(){
        System.out.println("University Name: "+ universityName);
    }

    public static void main(String[] args) {
        Students student = new Students();
        Students student1 = new Students("Rahim", "SQA");
        Students student2 = new Students("Karim", "HCI", "AIUB");
        student.name = "Kader";
        student.courseName = "DLD";
        student.universityName = "AUST";
        student1.universityName = "NSU";
        student.printName();
        student.printCourseName();
        student.printUniversityName();
        System.out.println();
        student1.printName();
        student1.printCourseName();
        student1.printUniversityName();
        System.out.println();
        student2.printName();
        student2.printCourseName();
        student2.printUniversityName();
    }
}
