package practice.generics;

public class Numbers<N> {
    private N num1, num2;

    public Numbers(N num1, N num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public N getNum1() {
        return num1;
    }

    public N getNum2() {
        return num2;
    }
}
