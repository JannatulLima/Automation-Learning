//assignment -6, item - 3

package practice.generics;

public class GenericsTest {
    public static void main(String[] args) {
        Numbers<Integer> integerNumbers = new Numbers<>(20, 10);
        Numbers<Double> doubleNumbers = new Numbers<>(20.0, 10.0);
        Numbers<Float> floatNumbers = new Numbers<>(20.0f, 10.0f);
        System.out.println("====== Integer Numbers ======");
        System.out.println(integerNumbers.getNum1());
        System.out.println(integerNumbers.getNum2());
        System.out.println("====== Double Numbers ======");
        System.out.println(doubleNumbers.getNum1());
        System.out.println(doubleNumbers.getNum2());
        System.out.println("====== Float Numbers ======");
        System.out.println(floatNumbers.getNum1());
        System.out.println(floatNumbers.getNum2());
    }
}
