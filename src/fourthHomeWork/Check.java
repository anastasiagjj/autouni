package fourthHomeWork;

import java.util.*;

public class Check {

    public static void main(String[] args) {
        //To check 1st and 2nd task
        List<String> list = new ArrayList<>();
        list.add("One"); list.add("two"); list.add("nine");
        list.add("zero"); list.add("three"); list.add("five");
        list.add("seven"); list.add("two");

        List<String> list1 = new ArrayList<>();
        list1.add("zero"); list1.add("four"); list1.add("six");
        list1.add("seven"); list1.add("ten"); list1.add("One");
        list1.add("two"); list1.add("eleven"); list1.add("sixteen");
        list1.add("twenty"); list1.add("ten"); list1.add("seven");

        User user = new User();
        List<String> commonList = user.extractListOfCommonElements(list, list1);
        System.out.println(commonList.size());
        for (String s : commonList) {
            System.out.println(s);
        }

        Set<String> commonSet = user.extractSetOfCommonElements(list1, list);
        System.out.println(commonSet.size());
        for (String s : commonSet) {
            System.out.println(s);
        }

        //to check 3rd task
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("abc"); list2.add("def");
        list2.add("abc"); list2.add("ghi");
        list2.add("def");

        user.displayIndexAndElementsOfList(list2);

        //to check 4th task
        HashSet<String> set = new HashSet<>();
        set.add("cba"); set.add("fed");
        set.add("cba"); set.add("igh");
        set.add("fed");

        user.displayElementsOfSet(set);

        //to check 5th task
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "One");
        map.put(2, "Three");
        map.put(4, "Four");

        user.iterateByValuesInMap(map);
        user.iterateByKeysInMap(map);
        user.iterateByEntrySetInMap(map);
    }

}
