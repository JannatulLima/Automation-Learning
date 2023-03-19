package practice.ClassB;

import practice.classA.WithinClass;

public class OutsidePackageSubClassOnly {
    public static void main(String[] args) {
        WithinClass s = new WithinClass("Lima", 27, "SQA", "A");
        System.out.println("========== outside package by subclass only ==========");
      //  System.out.println("Name: " + s.printStudentName());
     //   System.out.println("Age" + s.printStudentAge());
        System.out.println("Course Name: " + s.printStudentSection());
        System.out.println("Section: " + s.printStudentSection());
    }
}
