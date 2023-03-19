//assignment -6, item - 2
package practice.nongeneric;

public class NonGenericTest {
    public static void main(String[] args) {
        Operation operation = new Operation("Calculation");
        Addition addition = new Addition(10, 5);
        Multiplication multiplication = new Multiplication(10, 20);
        System.out.println("========== Operation: " + operation.getOperationName()+ " ==========");
        System.out.println("Sum is: " + addition.printAdditionOfNumbers());
        System.out.println("Multiplication is: " + multiplication.printMultiplicationOfNumbers());
    }
}
