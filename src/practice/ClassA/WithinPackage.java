package practice.ClassA;

public class WithinPackage {
    public static void main(String[] args) {
        WithinClass s = new WithinClass("Lima", 27, "SQA", "A");
        System.out.println("========== within package ==========");
        System.out.println("Name: " + s.printStudentName());
       // System.out.println("Age" + s.printStudentAge());
        System.out.println("Course Name: " + s.printStudentSection());
        System.out.println("Section: " + s.printStudentSection());
    }
}
