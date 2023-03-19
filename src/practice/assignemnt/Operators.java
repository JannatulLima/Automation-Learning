package practice.assignemnt;

public class Operators{
    int num1, num2;

    public void currentValueOfnumbers(){
        System.out.println("num1 = "+ num1);
        System.out.println("num2 = "+ num2);
    }

    public void unaryOperator(){
        System.out.println("++num1 = "+ ++num1); //pre increment
        System.out.println("--num1 = "+ --num1); //pre decrement
        System.out.println("num2-- = "+ num2--); //post decrement
        System.out.println("num2++  = " + num2++); //post increment
    }

    public void assignmentOperator(){
        System.out.println("num2 % num1 = "+ (num2 %= num1));
        System.out.println("num1 = " + num1 + ", num2 = " + num2);
        System.out.println();
        System.out.println("num1 + num2 = " + (num1+=num2));
        System.out.println("num1 = " + num1 + ", num2 = " + num2);
        System.out.println();
        System.out.println("num1 - num2 = " + (num1-= num2));
        System.out.println("num1 = " + num1 + ", num2 = " + num2);
        System.out.println();
        System.out.println("num1 / num2 = " + (num1 /= num2));
        System.out.println("num1 = " + num1 + ", num2 = " + num2);
    }

    public void arithmeticTernaryOperator(){
        num2 = num1 * 2;
        System.out.println("num1 = " + num1 + ", num2 = " + num2);
        int min = (num1<num2)?num1:num2;
        System.out.println("minimum between " + num1 +" & " + num2 + " is  = " +min);

        num2 = num2 /num1;
        System.out.println("num1 = " + num1 + ", num2 = " + num2);
        int max = (num1>num2)?num1:num2;
        System.out.println("Maximum between " + num1 +" & " + num2 + " is  = " +min);

        num2 = num2 + num1;
        System.out.println("num1 = " + num1 + ", num2 = " + num2);
        int min2 = (num1<num2)?num1:num2;
        System.out.println("Maximum between " + num1 +" & " + num2 + " is  = " +min);

        num2 = num2 - num1;
        System.out.println("num1 = " + num1 + ", num2 = " + num2);
        int max2 = (num1>num2)?num1:num2;
        System.out.println("Maximum between " + num1 +" & " + num2 + " is  = " +min);
    }

    public void relationalLogicalOperator(){
        System.out.println("num1<num1 && num2 != num1 = " + (num1<num1 && num2 != num1));
        System.out.println("num1>num1 || num2 != num1 = " + (num1>num1 || num2 != num1));
        System.out.println("num1<=num1 && num2 == num1 = " + (num1<=num1 && num2 == num1));
        System.out.println("num1>=num1 && num2 != num1 = " + (num1>=num1 && num2 != num1));
    }


    public static void main(String[] args) {
        Operators operator = new Operators();
        operator.num1=10;
        operator.num2 =11;
        System.out.println("===========================================================");
        operator.currentValueOfnumbers();
        System.out.println("===========================================================");
        operator.unaryOperator();
        System.out.println("===========================================================");
        operator.currentValueOfnumbers();
        System.out.println("===========================================================");
        operator.assignmentOperator();
        System.out.println("===========================================================");
        operator.arithmeticTernaryOperator();
        System.out.println("===========================================================");
        operator.currentValueOfnumbers();
        System.out.println("===========================================================");
        operator.relationalLogicalOperator();
    }
}
