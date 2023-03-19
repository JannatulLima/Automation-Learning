//3rd assignment, item -1
package practice.assignemnt;

public class Teacher {
    String name;
    String courseName;
    String universityName;

    public Teacher(){  //constructor

    }

    public void printTeacherName(){
        System.out.println("Teacher Name: "+ name);
    }

    public void printTeacherCourseName(){
        System.out.println("Course Name: "+ courseName);
    }

    public void printTeacherUniversityName(){
        System.out.println("University Name: "+ universityName);
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "MD. Abdul Karim";
        teacher.courseName = "Human Computer Interaction";
        teacher.universityName = "Dhaka University";
        System.out.println("========== Teacher Details ==========");
        teacher.printTeacherName();
        teacher.printTeacherCourseName();
        teacher.printTeacherUniversityName();
    }
}
