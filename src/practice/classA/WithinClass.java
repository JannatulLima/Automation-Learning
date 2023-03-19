package practice.classA;

public class WithinClass {
    String name; //default access modifier
    private int age; //private access modifier
    public String courseName; //public access modifier
    protected String section; //protected access modifier

    public WithinClass(String name, int age, String courseName, String section) {
        this.name = name;
        this.age = age;
        this.courseName = courseName;
        this.section = section;
    }

    String printStudentName() {
        return name;
    }

    private int printStudentAge() {
        return age;
    }

    public String printStudentCourseName(){
        return courseName;
    }

    public String printStudentSection(){
        return section;
    }

    public static void main(String[] args) {
        WithinClass s = new WithinClass("Lima", 27, "SQA", "A");
        System.out.println("========== within class ==========");
        System.out.println("Name: " + s.printStudentName());
        System.out.println("Age" + s.printStudentAge());
        System.out.println("Course Name: " + s.printStudentSection());
        System.out.println("Section: " + s.printStudentSection());
    }
}