package practice.assignemnt;

public class Calculator {
    int a = 7432434;
    float b = 555.47f;

    public void addition(){
        System.out.println(a+b);
    }

    public void subtraction(){
        System.out.println(a-b);
    }

    public void multiplication(){
        System.out.println(a*b);
    }

    public void division(){
        System.out.println(a/b);
    }

    public void modulus(){
        System.out.println(a%b);
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.addition();
        c.multiplication();
        c.subtraction();
        c.division();
        c.modulus();
    }
}
