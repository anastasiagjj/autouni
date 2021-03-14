package fourthHomeWork;

import java.util.*;

public class User {

    private String name;
    private Integer age;

    List<String> extractListOfCommonElements(List<String> list1, List<String> list2) {
        List<String> result = new ArrayList<>();
        for (String item : list1) {
            for (String elem : list2) {
                if (item.equals(elem)) {
                    result.add(item);
                }
            }
        }
        return result;
    }

    Set<String> extractSetOfCommonElements(List<String> list1, List<String> list2) {
        Set<String> result = new HashSet<>();
        for (String item : list1) {
            for (String elem : list2) {
                if (item.equals(elem)) {
                    result.add(item);
                }
            }
        }
        return result;
    }

    void displayIndexAndElementsOfList(ArrayList<String> list) {
        for(int i = 0; i < list.size(); i++) {
            System.out.println(i + ": " + list.get(i));
        }
    }

    void displayElementsOfSet(HashSet<String> set) {
        for (String s : set) {
            System.out.println(s);
        }
    }

    void iterateByValuesInMap(HashMap<Integer, String> map) {
        for (String value : map.values()) {
            System.out.println(value);
        }
    }

    void iterateByKeysInMap(HashMap<Integer, String> map) {
        for (Integer key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }

    void iterateByEntrySetInMap(HashMap<Integer, String> map) {
        for (Map.Entry<Integer, String> integerStringEntry : map.entrySet()) {
            System.out.println(integerStringEntry.getKey() + ": " + integerStringEntry.getValue());
        }
    }

}
