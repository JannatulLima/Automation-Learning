package practice.ClassB;

import practice.classA.Calculation;

public class Calculator {
    public static void main(String[] args) {
        Calculation calculator = new Calculation("Lima", 10,5);
        calculator.printOperatorName();
        System.out.println("\n"+ "Addition is: " + calculator.addition());
        System.out.println("Subtraction is: " + calculator.subtraction());
        System.out.println("Multiplication is: " + calculator.multiplication());
        System.out.println("Division is: " + calculator.division());
    }
}
