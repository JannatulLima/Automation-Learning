package practice.list;

public class NumberListTest {
    public static void main(String[] args) {
        NumberList numberList = new NumberList();
        numberList.removeIndexNo = 3;
        numberList.updateIndexNo = 3;
        numberList.updateIndexValue = 9;
        numberList.searchIndexNo = 3;

        numberList.addNumbers();
        numberList.printCurrentNumberList();
        numberList.searchIndex();
        numberList.removeNumber();
        numberList.printCurrentNumberList();
        numberList.searchIndex();
        numberList.updateNumber();
        numberList.printCurrentNumberList();
    }
}
