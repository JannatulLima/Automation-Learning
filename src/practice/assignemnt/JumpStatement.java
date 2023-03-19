//3rd assignment, item - 5
package practice.assignemnt;

public class JumpStatement {
    public static void main(String[] args){
        //break statement
        for (int i = 1; i <= 10; i++){
            if (i == 5){
                break;
            }
            System.out.println("I am " + i);
        }

        System.out.println();

        //continue statement
        for (int i = 1; i <= 10; i++){
            if (i == 5){
                System.out.println("you skipped printing five");
                continue;
            }
            System.out.println("I am " + i);
        }
    }
}
