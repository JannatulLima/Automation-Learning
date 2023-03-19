package practice.encapsulation;

public class EncapsulationTest {
    public static void main(String[] args) {
        Person person = new Person();
        Student student = new Student();
        Employee employee = new Employee();

        //Fully practice.encapsulation
        person.setFirstName("Jannatul");
        person.setLastName("Lima");
        person.setAge(27);
        System.out.println("\n" + "========== Person Details (Fully Encapsulation) ==========");
        System.out.println("Person's First Name: " + person.getFirstName());
        System.out.println("Person's Last Name: " + person.getLastName());
        System.out.println("Person's Age: " + person.getAge());

        //Write only practice.encapsulation
        student.setName("Shahrin");
        student.setUniversityName("AIUB");
        student.setRoll(23);
        System.out.println("\n" + "========== Write only practice.encapsulation successful ==========" + "\n");

        //Read only practice.encapsulation
        System.out.println("========== Employee Details (Read only practice.encapsulation) ==========");
        System.out.println(employee.getName());
        System.out.println(employee.getDesignation());
        System.out.println(employee.getCompanyName());
    }
}
