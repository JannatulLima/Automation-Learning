package practice.ClassA;

public class Calculation {
    private int num1, num2;
    private String operatorName;

    public Calculation(String operatorName, int num1, int num2) {
        this.operatorName = operatorName;
        this.num1 = num1;
        this.num2 = num2;
    }

    public void printOperatorName() {
        System.out.println("Operator name is: " + operatorName);
    }

    public int addition() {
        return num1 + num2;
    }

    public int subtraction() {
        return num1 - num2;
    }

    public int multiplication() {
        return num1 * num2;
    }

    public int division() {
        return num1 / num2;
    }
}

