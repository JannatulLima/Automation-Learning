package practice.set;

public class SetTest {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        numbers.removeNumberFromCollectionOne = 3;
        numbers.removeNumberFromCollectionTwo = 1;
        //============adding numbers===========
        numbers.printSetSize();
        numbers.addNumbersToAllCollections();
        numbers.printCurrentNumbers(); //duplicate number will not be printed
        numbers.printSetSize();
        //============removing numbers===========
        numbers.removeNumber();
        numbers.printCurrentNumbers();
        numbers.printSetSize();
        //============Removing all numbers from collection which are common with collection two ===========
        numbers.removeAllNumbersExceptCommon();
        numbers.printCurrentNumbers();
        numbers.printSetSize();
        //============clearing numbers===========
        numbers.clearAllCollections();
        numbers.printCurrentNumbers();
        numbers.printSetSize();
    }
}
