//assignment -7, item   2
package practice.set;

import java.util.HashSet;
import java.util.Set;

public class Numbers {
    int removeNumberFromCollectionOne, removeNumberFromCollectionTwo ;

    Set<Integer> integerSet = new HashSet<>();
    Set<Integer> integerSet1 = new HashSet<>();

    public void addNumbersToAllCollections(){
        System.out.println("Adding numbers in collection one: 1 2 3 4 4 5");
        System.out.println("Adding numbers in collection two: 1 2");
        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(3);
        integerSet.add(4);
        integerSet.add(4);//duplicate
        integerSet.add(5);
        integerSet1.add(1);
        integerSet1.add(2);
        System.out.println("Numbers addition in both collections successful");
    }

    public void printCurrentNumbers(){
        System.out.print("\n" + "Current practice.set of first collection is: ");
        for (int pickNumber: integerSet) {
            System.out.print(pickNumber + " ");
        }

        System.out.print("\n" + "Current practice.set of second collection is: ");
        for (int pickNumber: integerSet1) {
            System.out.print(pickNumber + " ");
        }
    }

    public void printSetSize(){
        System.out.println("\n" + "Set size of first collection is: " + integerSet.size());
        System.out.println("Set size of second collection is: " + integerSet1.size());
    }

    public void removeNumber(){
        integerSet.remove(removeNumberFromCollectionOne);
        System.out.println("\n" + "Removing Number " + removeNumberFromCollectionOne + " from first collection is successful");
        integerSet1.remove(removeNumberFromCollectionTwo);
        System.out.println("Removing Number " + removeNumberFromCollectionTwo + " from first collection is successful");
    }

    public void removeAllNumbersExceptCommon(){
        integerSet.removeAll(integerSet1);
        System.out.println("\n" + "Removing all numbers from collection which are common with collection two successful");
    }


    public void clearAllCollections(){
        integerSet.clear();
        integerSet1.clear();
        System.out.println("Clearing all collections successful");
    }
}
