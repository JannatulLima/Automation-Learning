//assignment 7, item 3
package practice.map;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {

        List<String> sqaClassList = new ArrayList<>();
        sqaClassList.add("Class");
        sqaClassList.add("Interface");
        sqaClassList.add("Abtract Class");

        Map<String, Object> learning = new LinkedHashMap<>(); //used linkedhashmap to keep the order intact
        learning.put("java", true);
        learning.put("selenium", false);
        learning.put("appium", "yes");

        Map<String, Object> map = new LinkedHashMap<>();
        map.put("name", "John");
        map.put("age", 22);
        map.put("learning", learning);
        map.put("sqaClass", sqaClassList);

        System.out.println(map);
    }
}
