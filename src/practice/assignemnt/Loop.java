//3rd assignment, item - 4
package practice.assignemnt;

public class Loop {
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5};
        //for loops
        for (int i = 1; i <= 10; i++){   //print 1~10
            System.out.println(i);
        }

        System.out.println();

        for (int i = 10; i > 0; i--){   //print 10~1
            System.out.println(i);
        }

        System.out.println();

        //for each
        for(int iterate: num){
            System.out.println(iterate);
        }

        System.out.println();

        //while loop
        int i = 1;
        while (i <= 10){
            System.out.println(i);
            i++;
        }

        System.out.println();

        //do while loop
        int j = 10;
        do{
            System.out.println(j);
            j--;
        }
        while (j >  0);
    }
}
