//assignment -6, item   4
package practice.list;

import java.util.ArrayList;
import java.util.List;

public class NumberList {
    int removeIndexNo, searchIndexNo, updateIndexNo, updateIndexValue;

    List<Integer> intlist = new ArrayList<>();

    public void addNumbers(){
        System.out.println("Adding numbers as: 1 2 3 4 5 5");
        intlist.add(1);
        intlist.add(2);
        intlist.add(3);
        intlist.add(4);
        intlist.add(5);
        intlist.add(5); //duplicate
    }

    public void printCurrentNumberList(){
        System.out.print("\n" + "Current List is: ");
        for (int index: intlist) {
            System.out.print(index + " ");
        }
    }

    public void removeNumber(){
        System.out.println("Removing index " + removeIndexNo + " value: " + intlist.get(removeIndexNo));
        intlist.remove(removeIndexNo);
    }

    public void searchIndex(){
        System.out.println("\n" + "Value of index " + searchIndexNo + " is now: " + intlist.get(searchIndexNo));
    }

    public void updateNumber(){
        System.out.println("Updating index " + updateIndexNo + " with value " + updateIndexValue);
        intlist.set(updateIndexNo, updateIndexValue);
    }
}
