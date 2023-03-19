package practice.polymorphism;

public class Addition extends MathematicalOperation {
    int num1, num2, num3;

    @Override
    public void printOperationTitle(){
        System.out.println("========== Addition Operation ==========");
    }

    public int addition (int num1, int num2){
        System.out.print(num1 + " + " + num2 + " = ");
        return num1+num2;
    }

    public int addition (int num1, int num2, int num3){   //method overloading
        System.out.print("\n" + num1 + " + " + num2 + " + " + num3 + " = ");
        return num1+num2+num3;
    }

    public static void main(String[] args) {
        Addition addition = new Addition();
        addition.printOperationTitle();
        System.out.print(addition.addition(30,20));
        System.out.println(addition.addition(40,50,10));
    }

}
