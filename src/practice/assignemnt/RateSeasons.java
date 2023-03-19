//3rd assignment, item-3
package practice.assignemnt;

public class RateSeasons {

    public static void main(String[] args) {
        int rateSummer = 30;
        int rateWinter = 50;
        int rateSpring = 90;
        int rateRainy = 70;

        //if statement
        if (rateSummer < 50) {
            System.out.println("You rated summer less than 50 points!");
        }

        //if-else statement
        if (rateWinter > 80) {
            System.out.println("You rated winter more than 80 points!");
        } else {
            System.out.println("You rated winter less than 80 points!");
        }

        //if-else-if ladder
        if (rateSpring < 50){
            System.out.println("You rated spring less than 50!");
        }
        else if (rateSpring > 50 && rateSpring < 80){
            System.out.println("You rated spring more than 50 but less than 80");
        }
        else {
            System.out.println("You rated spring more than 80, thus you must love spring!!");
        }

        //nested if statement
        if (rateRainy > 50){
            if (rateRainy > 80){
                System.out.println("You rated rainy season more than 80, thus you must love rainy season!!");
            }
            else{
                System.out.println("You rated rainy less than 80 points!");
            }
        }
        else{
            System.out.println("You rated rainy less than 50 points!");
        }
    }
}
